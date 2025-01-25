/*
 * Problem: Write a program to print the following pattern.
 *      1
 *      01 
 *      101
 *      0101
 *      10101
 *
 */

 import java.util.Scanner;

public class pattern04_01Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows: ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
