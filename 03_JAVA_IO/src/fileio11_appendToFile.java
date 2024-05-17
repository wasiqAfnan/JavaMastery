import java.io.*;
public class fileio11_appendToFile {
    public static void main(String[] args) {
        File fs = new File("Files/textFile.txt");
        FileWriter fw = null;
        String data = "Rohan Gupta\n";

        try{
            fw = new FileWriter(fs,true);
            fw.write(data);
            System.out.println("Done");
        }
        catch(IOException ie){
            System.out.println(ie.getMessage());
        }
        finally{
            try {
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
