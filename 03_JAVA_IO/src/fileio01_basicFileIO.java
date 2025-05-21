import java.io.File;
import java.io.IOException;

class fileio01_basicFileIO{
    public static void main(String[] args) {
        // create an object of File class
        File myFile = new File("Files/myFile.txt");
        try{
            // boolean res = myFile.createNewFile(); // given either true or false value
            // System.out.println(res);

            // Creating a file
            if(myFile.createNewFile()){
                System.out.println("File created Succesfully");
            }
            else{
                System.out.println("File already exists!");
            }
        }
        catch(IOException ie){
            System.out.println(ie.getMessage());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}