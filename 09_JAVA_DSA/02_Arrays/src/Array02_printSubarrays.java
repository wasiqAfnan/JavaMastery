/*
 * Problem Statement

    Given an array of integers, write a program to find and print all possible subarrays.
    A subarray is a contiguous part of the array that is obtained by deleting 
    some (possibly zero) elements from the beginning and some (possibly zero) 
    elements from the end of the array.

    Input: arr = [1, 2, 3]
    Output: 
        [1]
        [1, 2]
        [1, 2, 3]
        [2]
        [2, 3]
        [3]

*/

import java.util.ArrayList;
import java.util.Arrays;

public class Array02_printSubarrays {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(1, 2, 3));

        for(int i = 0; i < num.size(); i++){
            for(int j = i; j < num.size(); j++){
                for(int k = i; k <= j; k++){
                    System.out.print(num.get(k) + " ");
                }
                System.out.println();
            }
        }
    }
}