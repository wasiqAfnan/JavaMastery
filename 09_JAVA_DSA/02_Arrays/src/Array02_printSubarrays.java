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
    // Brute force O(n^3)
    public static void bruteForceApproach(ArrayList<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            for (int j = i; j < num.size(); j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num.get(k) + " ");
                }
                System.out.println();
            }
        }
    }

    // optimized Approach O(n^2)
    public static void optimizedApproach(ArrayList<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            // craeting new array for storing sub array in each iteration
            ArrayList<Integer> subArr = new ArrayList<>();
            for (int j = i; j < num.size(); j++) {
                // adding new element in each iteration
                subArr.add(num.get(j));
                System.out.println(subArr); // printing growing subarrays
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(1, 2, 3));
        // bruteForceApproach(num);
        optimizedApproach(num);
    }
}