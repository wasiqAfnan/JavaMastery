import java.util.Scanner;

public class Basic05_ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();

        //if-else statement
        // if(age>=18){
        //     System.out.println("You are eligible to drive");
        // }
        // else{
        //     System.out.println("You are not eligible to drive");
        // }

        // if-else ladder
        // if(age>=18){
        //     System.out.println("You are eligible to drive");
        // }
        // else if(age>=12){
        //     System.out.println("You are eligible to ride");
        // }
        // else{
        //     System.out.println("You are not eligible to either ride or drive");
        // }

        //nested if-else
        // System.out.println("Enter First Number: ");
        // int a = sc.nextInt();
        // System.out.println("Enter Second Number: ");
        // int b = sc.nextInt();
        // System.out.println("Enter Third Number: ");
        // int c = sc.nextInt();

        // if(a>b){
        //     if(a>c){
        //         System.out.println(a+" is greatest");
        //     }
        //     else{
        //         System.out.println(c+" is greatest");
        //     }
        // }
        // else{
        //     if(b>c){
        //         System.out.println(b+" is greatest");
        //     }
        //     else{
        //         System.out.println(c+" is greatest");
        //     }
        // }

        //Switch-case Statement

        System.out.println("Enter your rating between 1 to 5: ");
        int rating = sc.nextInt();

        switch(rating){
            case 1:{
                System.out.println("You are rated us 1 star");
                break;
            }
            case 2:{
                System.out.println("You are rated us 2 star");
                break;
            }
            case 3:{
                System.out.println("You are rated us 3 star");
                break;
            }
            case 4:{
                System.out.println("You are rated us 4 star");
                break;
            }
            case 5:{
                System.out.println("You are rated us 5 star");
                break;
            }
            default:{
                System.out.println("Invalid rating");
                break;
            }
        }


    }
}
