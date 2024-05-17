import java.io.*;

public class fileio06_fileWriter {
    public static void main(String[] args) {
        File path = new File("Files/textFile.txt");

        try {
            if (path.exists()) {
                FileWriter fw = new FileWriter(path);
                String name = "Sohini sen";

                try {
                    fw.write(name);
                    System.out.println("Successfullt written to the file");
                } catch (IOException ie) {
                    ie.getMessage();
                } finally {
                    fw.close();
                }
            }
            else{
                System.out.println("file does not exists");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
