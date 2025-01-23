/*
 * Problem: Write a program to print the following pattern.
 * 
 *      *****
 *      *****
 *      *****
 *      *****
 */

 import java.util.Scanner;

public class pattern01_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of starts in one row: ");
        int columns = sc.nextInt();

        for( int i = 0; i < rows; i++){
            for( int j = 0; j < columns; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}