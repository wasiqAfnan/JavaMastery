import java.sql.Date;
import java.util.Scanner;

public class ResturantBillGenerationSystem {
    // color code for terminal
    static String RESET = "\u001B[0m";
    static String YELLOW = "\u001B[33m";
    static String RED = "\u001B[31m";
    static String GREEN = "\u001B[32m";
    static String CYAN = "\u001B[36m";
    static String PURPLE = "\u001B[35m";

    // main program variables
    static String customerName;
    static Date date = new Date(0);
    static int products;
    static String[] productName;
    static int[] productQuantity;
    static int[] productPrice;
    static int[] sum;
    static int total = 0;
    static int discount = 0;
    static int finalPrice = 0;

    public static void display() {
        System.out.println("\n\n\n\n---------------------------------------------------------------------------");
        System.out.println(YELLOW + "\t\t\tIndia Resturant" + RESET);
        System.out.println("---------------------------------------------------------------------------");

        // print date and customer name
        System.out.print(GREEN + date.toLocalDate().now() + "\t\t\t\t\t\tInvoice to: " + customerName + "\n" + RESET);
        System.out.println("---------------------------------------------------------------------------");

        // Print title product name, product quantity, total
        System.out.print(CYAN + "Product Name"+RESET);
        System.out.print(CYAN + "\t\t\tQuantity"+RESET);
        System.out.print(CYAN + "\t\t\tTotal/-\n"+RESET);
        System.out.println("---------------------------------------------------------------------------");

        // print product name, product quantity, total data
        for (int i = 0; i < products; i++) {
            System.out.print(PURPLE + productName[i] + RESET);
            System.out.print("\t\t\t\t  " + productQuantity[i]);
            System.out.print("\t\t\t\t" + GREEN + productPrice[i] + RESET + "\n");
        }

        System.out.println("---------------------------------------------------------------------------");

        // print Total and discount
        System.out.println(GREEN + "Total (Discount - " + discount + "/-): \t\t\t\t\t"+ finalPrice + "/-" + RESET);
        System.out.println("---------------------------------------------------------------------------");

        // greetings
        System.out.println(CYAN + "Thank You!!!! Visit again" + RESET);
        System.out.println("------------------------------XXXXXXXXXXXXXXXXXXXXXXX----------------------\n\n\n\n");

    }

    public static void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print(RED + "What is the name of the customer? - " + RESET);
        customerName = sc.nextLine();
        System.out.print(RED + "How many products does the customer purchases? - " + RESET);
        products = sc.nextInt();

        // Reinitialize the arrays with the correct size
        productName = new String[products];
        productQuantity = new int[products];
        productPrice = new int[products];

        // getting details about the product name, quantity and price
        for (int i = 0; i < products; i++) {
            // getting product name
            System.out.print(YELLOW + "Enter the product name: " + RESET);
            productName[i] = sc.next();

            // getting product quantity
            System.out.print(YELLOW + "Enter the product quantity: " + RESET);
            productQuantity[i] = sc.nextInt();

            // getting product price
            System.out.print(YELLOW + "Enter the product price per unit: " + RESET);
            productPrice[i] = sc.nextInt();

            // getting discount
            System.out.print(YELLOW + "Discount (if any in percentage): " + RESET);
            discount = sc.nextInt();
        }
        calculate();
        display();
    }

    public static void calculate(){
        for(int i = 0; i < products; i++){
            total += productQuantity[i] * productPrice[i];
        }

        if(discount > 0 ){
            discount = (total * discount) / 100;          
        }

        finalPrice = total - discount;
    }
    public static void main(String[] args) throws Exception {
        userInput();
    }
}
