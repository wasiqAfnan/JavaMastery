import java.util.Scanner;
public class oop14_ExceptionalHandlingBasic {
    public static void main(String[] args) {
        // Arithmetic exception (div 0)

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first number: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter second number: ");
        // int num2 = sc.nextInt();
        // try{
        //     int r = num1/num2;
        //     System.out.println("Result = " + r);
        // }
        // catch(Exception e){
        //     System.out.println(e.getMessage()); // just shows the message
        //     System.out.println(e.toString()); // by default toString functions runs and shows the details of exception along with message
        //     e.printStackTrace(); // toString() + localtion (which file and which lines is triggering exception)
        // }
        
        // ArrayIndexOutOfBoundsException
        // int[] arr = {14,54,21,78,90};
        // System.out.print("Enter the index: ");
        // int index = sc.nextInt();
        
        // try{
        //     System.out.println(arr[index]);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println(e.getMessage());
        // }

        // NullPointerException

        String name = null;
        try{
            System.out.println(name.length());
        }
        catch(NullPointerException e){
            System.out.println("Error occured: " + e.getMessage());
        }
    }
}
