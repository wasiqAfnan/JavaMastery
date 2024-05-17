import java.io.*;
import java.util.Scanner;

public class fileio12_exercise_countNoOfLinesWordsChars {
    public static void main(String[] args) {
        /**
         * Using Buffered Reader class
         */
        File fs = new File("Files/textFile.txt");
        // FileReader fr = null;
        // BufferedReader br = null;
        String data = "";
        int line = 0;
        int words = 0;
        int characters = 0;

        // try{
        // fr = new FileReader(fs);
        // br = new BufferedReader(fr);

        // while((data = br.readLine()) != null){
        // line++;
        // characters += data.length();
        // String[] word = data.split("\\s+");
        // words += word.length;
        // }

        // System.out.println("Lines: "+line);
        // System.out.println("Words: "+words);
        // System.out.println("Characters: "+characters);
        // }
        // catch(IOException ie){
        // ie.printStackTrace();
        // }
        // finally{
        // try{
        // br.close();
        // fr.close();
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
        // }

        /**
         * Using Scanner class
         */

        try {
            Scanner sc = new Scanner(fs);
            while (sc.hasNextLine()) {
                line++;
                data = sc.nextLine();
                characters += data.length();
                String[] word = data.split("\\s+");
                words += word.length;
            }

            System.out.println("Lines: "+line);
            System.out.println("Words: "+words);
            System.out.println("Characters: "+characters);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
