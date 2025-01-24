/*
 * Problem: Write a program to print the following pattern.
 * 
 *      *****
 *      ****
 *      ***
 *      **
 *      *
 */

import java.util.Scanner;

public class pattern03_invertedStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows: ");
        int rows = sc.nextInt();

        for(int i = rows; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
