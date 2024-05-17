import java.util.Scanner;
public class oop02_Functions {

    // public static void print(){
    //     // funtion code
    //     System.out.println("I am a function");
    // }

    // public static int add(int a,int b){
    //     int c = a+b;
    //     return c;
    // }

    public static void greetUser(String name){
        System.out.println("hello, "+name);
    }
    public static void main(String[] args) {
        // function call
        // print();

        // calling add function
        // int sum = add(5,7);
        // System.out.println(sum);

        // int sum2 = add(10,20);
        // System.out.println(sum2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String yourName = sc.nextLine();
        // function call
        greetUser(yourName);
    }
}
