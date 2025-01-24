/*
 * Problem: Write a program to print the following pattern.
 * 
 *      A
 *      BC
 *      DEF
 *      GHIJ
 *      KLMNO
 */

import java.util.Scanner;

public class pattern05_characterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char myChar = 'A';

        System.out.print("How many rows: ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(myChar);
                myChar++;
            }
            System.out.println();
        }
    }
}
