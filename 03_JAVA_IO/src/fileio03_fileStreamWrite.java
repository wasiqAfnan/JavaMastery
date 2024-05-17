import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class fileio03_fileStreamWrite {
    public static void main(String[] args) {
        File myFile = new File("Files/myFile.txt");
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Type what you want to insert: ");
        name = sc.nextLine();
        try{
            if(myFile.exists()){
                // Creating object of FileOutputStream
                FileOutputStream fos = new FileOutputStream(myFile);
                byte[] myData = name.getBytes();

                try{
                    fos.write(myData);
                    System.out.println("Data written succefully");
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
