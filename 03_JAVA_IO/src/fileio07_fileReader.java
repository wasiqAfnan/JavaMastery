import java.io.*;

public class fileio07_fileReader {
    public static void main(String[] args) {
        File path = new File("Files/textFile.txt");
        try {
            if (path.exists()) {
                FileReader fr = new FileReader(path);
                int data;

                try {
                    while ((data = fr.read()) != -1) {
                        System.out.print((char) data);
                    }
                } catch (IOException ie) {
                    ie.toString();
                } finally {
                    fr.close();
                }

            } else {
                System.out.println("File does not exists");
            }
        } catch (Exception e) {

        }
    }
}
