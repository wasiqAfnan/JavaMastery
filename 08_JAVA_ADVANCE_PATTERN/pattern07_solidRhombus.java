/*
 * Problem: Write a program to print the following pattern.
 * 
 *          *****
 *         *****
 *        *****
 *       *****
 *      *****
 */

import java.util.Scanner;

public class pattern07_solidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("How many rows: ");
        int rows = sc.nextInt();

        System.out.print("How many cols: ");
        int cols = sc.nextInt();

        for(int i = 0; i < rows; i++){
            // for spaces
            for(int j = 0; j < rows-i-1; j++){
                System.out.print(" ");
            }

            // for stars
            for(int j = 0; j < cols; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
