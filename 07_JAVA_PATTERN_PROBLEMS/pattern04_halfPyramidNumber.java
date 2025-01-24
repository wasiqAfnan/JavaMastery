/*
 * Problem: Write a program to print the following pattern.
 * 
 *      1
 *      12
 *      123
 *      1234    
 *      12345
 */

import java.util.Scanner;

public class pattern04_halfPyramidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows: ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    
}