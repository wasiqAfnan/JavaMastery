/*
 * Problem Statement

    You are given an array of integers.
    An array is said to be sorted and rotated if it is possible to obtain it by taking a non-decreasing sorted array and rotating it some number of times.

    Your task is to check whether the given array is sorted and rotated.
    In other words, you need to determine if the array can be obtained from a sorted array after performing a rotation operation.

    Input: arr = [3, 4, 5, 1, 2] => [1, 2, 3, 4, 5]
    Output: true

*/

import java.util.*;

public class Array04_checkArraySortedRotated {
    public static boolean bruteForceApproach(int[] num) {
        boolean isSorted = true;

        for (int i = 0; i < num.length; i++) {
            isSorted = true;

            // check if sorted initially
            for (int k = 0; k < num.length - 1; k++) {
                if (num[k] > num[k + 1]) {
                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }

            // rotating array
            int temp = num[0];
            for (int j = 1; j < num.length; j++) {
                num[j - 1] = num[j];
            }
            num[num.length - 1] = temp;
            // System.out.println(Arrays.toString(num));

            
        }

        if (isSorted) {
            return true;
        }
        return false;
    }

    public static boolean optimizedApproach(int[] num) {
        int count = 0;
        // check if last elem is greater than first element
        if (num[num.length - 1] > num[0]) {
            count++;
        }

        for (int i = 0; i < num.length-1; i++) {
            if (num[i] > num[i + 1]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        int num[] = { 4, 3, 1, 2 };
        System.out.println(bruteForceApproach(num));
        // System.out.println(optimizedApproach(num));
    }
}
