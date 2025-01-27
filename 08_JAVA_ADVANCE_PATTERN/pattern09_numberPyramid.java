/*
 * Problem: Write a program to print the following pattern.
 * 
 *          1
 *         121
 *        12321
 *       1234321
 *      123454321
 */

import java.util.Scanner;
public class pattern09_numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("How many rows: ");
        int rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            int num = 0;
            // for spaces
            for(int j = 0; j < rows-i-1; j++){
                System.out.print(" ");
            }

            // for numbers
            for(int j = 0; j < 2*i+1; j++){
                if(j <= i){
                    System.out.print(++num);
                }
                else{
                    System.out.print(--num);
                }
            }
            System.out.println();
        }
    }
}
