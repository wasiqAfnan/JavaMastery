import java.util.Scanner;
public class oop15_MultipleCatch {
    public static void main(String[] args) {
        int arr[] = {25,5,47,85,60};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int index = sc.nextInt();
        System.out.print("Enter the number from which you want to divide: ");
        int num = sc.nextInt();

        try{
            int result = arr[index] / num;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Exception");
        }
        catch(ArithmeticException ae){
            System.out.println("Arithmetic exception");
        }
        catch(Exception fe){
            System.out.println("Another Exception");
        }

    }
}
