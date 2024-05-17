import java.util.Scanner;
public class oop19_Finally_Keyword {
    public static void main(String[] args) {
        // Declaring and initializing an array
        int arr[] = {25,54,67,85,12};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index number: ");
        int num = sc.nextInt();

        try{
            System.out.println(arr[num]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This is Finally block");
        }
    }
}
