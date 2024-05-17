import java.io.*;
public class fileio09_bufeerredWriter {
    public static void main(String[] args) {
        File myFile = new File("Files/BufferedWriterText.txt");
        FileWriter fw = null;
        BufferedWriter bfw = null;
        String data = "Hello, World!";

        try{
            if(myFile.exists()){
                fw = new FileWriter(myFile);
                bfw = new BufferedWriter(fw);
                bfw.write(data);
            }
            else{
                myFile.createNewFile();
                fw = new FileWriter(myFile);
                bfw = new BufferedWriter(fw);
                bfw.write(data);
            }
        }
        catch(IOException ie){
            ie.printStackTrace();
        }
        finally{
            try{
               bfw.close(); 
               fw.close();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
