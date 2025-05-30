public class Basic07_Loops {
    public static void main(String[] args) {
        // JAVA Loops
        // 1) For Loop
        // 2) While Loop
        // 3) Do-While Loop
        // 4) For Loop but diferent Syntax


        // 1) For Loop
        //for(initialization; condition; increment/decrement) {
        //    // statements
        //}

        // for(int i = 0; i < 5; i++) {
        //     System.out.println("Hello");
        // }

        // 2) While Loop
        // while(condition) {
        //     // statements
        // }
        
        // int i = 0;
        // while(i < 5) {
        //     System.out.println("Hello");
        //     i++;
        // }


        // 3) Do-While Loop
        // do {
        //     // statements
        // } while(condition);

        // int i = 5;
        // do {
        //     System.out.println("Hello");
        //     i++;
        // } while(i < 5);

        String name = "Wasiq Afnan";
        char myName[] = name.toCharArray();
        for(char c:myName){
            System.out.println(c);
        }

        //home work
        // 1) WAP to convert celsius to fahrenheit (9/5 x C) + 32
        // 2) WAP to convert kilometers to meters
        // 3) WAP to calculate area and perimeter of a Rectangle
        // 4) WAP to calculate area and perimeter of a Square
    }
}
