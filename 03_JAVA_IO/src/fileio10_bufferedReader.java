import java.io.*;
public class fileio10_bufferedReader {
    public static void main(String[] args) {
        File myFile = new File("Files/BufferedWriterText.txt");
        FileReader fr = null;
        BufferedReader bfr = null;
        String data = "";

        try{
            fr = new FileReader(myFile);
            bfr = new BufferedReader(fr);
            
            // reading one line at a time
            // String data = bfr.readLine();
            // System.out.println(data);

            while((data = bfr.readLine()) != null){
                System.out.println(data);
            }
        }
        catch(IOException ie){
            ie.printStackTrace();
        }
        finally{
            try {
                bfr.close();
                fr.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
