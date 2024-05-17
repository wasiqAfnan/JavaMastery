import java.io.*;
import java.util.Scanner;

public class fileio05_projectFileStream {

    static void write(File outputStreamFile) {
        try {
            FileOutputStream fos = new FileOutputStream(outputStreamFile);
            String msg = "Hey there we are going to write this content to a file";
            byte[] bytes = msg.getBytes();

            try {
                fos.write(bytes);
                System.out.println("Data written successfully");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void read(File outputStreamFile) {
        try {
            FileInputStream fis = new FileInputStream(outputStreamFile);
            int ch;

            try {
                while ((ch = fis.read()) != -1) {
                    System.out.print((char) ch);
                }
                System.out.println("\n File content read successfully");
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /*
         * Both FileInputStream and FileOutputStream classes operate directly with files
         * on disk, allowing you to read from and write to files byte by byte or in
         * larger chunks. They provide efficient mechanisms for performing file I/O
         * operations in Java.
         */

        /*
         * FileInputStream:
         * 
         * FileInputStream is a class used to read data from a file as a stream of
         * bytes.
         * It is meant for reading streams of raw bytes such as image data or binary
         * data.
         * It extends the InputStream abstract class and provides various methods for
         * reading bytes from a file.
         * 
         */

        /*
         * FileOutputStream:
         * 
         * FileOutputStream is a class used to write data to a file as a stream of
         * bytes.
         * It is meant for writing streams of raw bytes such as text data or binary
         * data.
         * It extends the OutputStream abstract class and provides various methods for
         * writing bytes to a file.
         * 
         */

        Scanner sc = new Scanner(System.in);
        File inputStreamFile = new File("Files/inputStreamFile.txt");
        File outputStreamFile = new File("Files/outputStreamFile.txt");

        try {
            if (outputStreamFile.exists() && inputStreamFile.exists()) {
                write(outputStreamFile);
                read(outputStreamFile);
            } else {
                System.out.print("File does not exists.\n Do you want to create a file: Y/N");
                char ch = sc.next().charAt(0);
                if (ch == 'y' || ch == 'Y') {
                    if (inputStreamFile.createNewFile() || outputStreamFile.createNewFile()) {
                        System.out.println("File has been created successfully");
                        write(outputStreamFile);
                        read(outputStreamFile);
                    } else {
                        System.out.println("Some error occured");
                    }
                } else {
                    System.exit(0);
                }
            }
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
