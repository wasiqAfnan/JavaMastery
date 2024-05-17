import java.io.File;
import java.io.IOException;

public class fileio02_fileMethods {
    public static void main(String[] args) {
        File myFile = new File("Files/myFile.txt");
        try {
            System.out.println(myFile.exists());// Check if file exists or not
            System.out.println(myFile.getAbsolutePath()); // give absolute path of the file
            System.out.println(myFile.getName()); // give the name of the file
            System.out.println(myFile.canRead()); // check if user have the permission to read from the file or not
            System.out.println(myFile.canWrite());  // check if user have the permission to write to the file or not
            System.out.println(myFile.canExecute());  // check if user have the permission to execute the file or not
            System.out.println(myFile.getParent()); // give the parent Folder of the file
            System.out.println(myFile.length()); // give the length of the file
            System.out.println(myFile.delete()); // delete the file and returns true or false
        }
        // catch(IOException ie){
        //     System.out.println(ie.getMessage());
        // }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
