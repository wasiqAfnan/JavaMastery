/*
 * Problem: Write a program to print the following pattern.
 * 
 *      *
 *     **
 *    ***
 *   ****
 *  *****
 *
 */

import java.util.Scanner;

public class pattern02_invertedRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows: ");
        int rows = sc.nextInt();

        // for stars
        for(int i = 0; i < rows; i++){
            // for space
            for(int j = 0; j < rows-i-1; j++){
                System.out.print(" ");
            }
            
            // for stars
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }
}
