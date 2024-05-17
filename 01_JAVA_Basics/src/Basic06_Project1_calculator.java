import java.util.Scanner;
public class Basic06_Project1_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1)Addition");
        System.out.println("2)Subtraction");
        System.out.println("3)Multiplication");
        System.out.println("4)Division");
        System.out.println("5)Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        switch(choice){
            case 1:{
                int num1,num2;
                System.out.println("Enter two numbers: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                int result = num1 + num2;
                System.out.println("Result: "+result);
                break;
            }
            case 2:{
                int num1,num2;
                System.out.println("Enter two numbers: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                int result = num1 - num2;
                System.out.println("Result: "+result);
                break;
            }
            case 3:{
                int num1,num2;
                System.out.println("Enter two numbers: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                int result = num1 * num2;
                System.out.println("Result: "+result);
                break;
            }
            case 4:{
                int num1,num2;
                System.out.println("Enter two numbers: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                int result1 = num1 / num2;// Qoutient
                int result2 = num1 % num2;// remainder
                System.out.println("Qoutient: "+result1);
                System.out.println("Remainder: "+result2);
                break;
            }
            case 5:{
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}
