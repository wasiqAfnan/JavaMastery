import java.io.*;
public class fileio04_fileStreamRead {
    public static void main(String[] args) {
        File myFile = new File("Files/myFile.txt");
        try{
            if(myFile.exists()){
                // Creating object of FileInputStream
                FileInputStream fis = new FileInputStream(myFile);
                int ch;
                try{
                    while((ch = fis.read()) != -1){
                        System.out.print((char) ch);
                    }
                    System.out.println("\nFile has been readed successfully");
                }
                catch(IOException ie){
                    ie.printStackTrace();
                }
                
            }
            else{
                System.out.println("File does not exists");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
