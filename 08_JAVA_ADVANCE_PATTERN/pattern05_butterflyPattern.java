/*
 * Problem: Write a program to print the following pattern.
 *      *      *
 *      **    **
 *      ***  ***
 *      ********
 *      ********
 *      ***  ***
 *      **    **
 *      *      *
 *
 */

import java.util.Scanner;

public class pattern05_butterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows: ");
        int rows = sc.nextInt();

        // first half
        for(int i = 0; i < rows; i++){
            // for stars
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }

            // for space
            for(int j = 0; j < (2*(rows-i-1)); j++){
                System.out.print(" ");
            }

            // for stars
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
        // first half
        for(int i = rows; i > 0; i--){
            // for stars
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }

            // for space
            for(int j = 0; j < (2*(rows-i)); j++){
                System.out.print(" ");
            }

            // for stars
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
