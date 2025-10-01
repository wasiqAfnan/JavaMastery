/*
 * Problem Statement

    You are given an array of integers.
    Your task is to determine whether any value appears at least twice in the array.

    If any element occurs more than once, return true.

    If every element is distinct, return false.

    Input: nums = [1, 2, 3, 1]
    Output: true

    Explanation:
    The value 1 appears twice in the array.

*/

import java.util.Arrays;
import java.util.HashSet;

public class Array06_containsDuplicate {
    // Brute Force Approach O(n^2)
    public static boolean bruteForceApproach(int[] num) {
        // using linear search approach
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if(num [i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // Slightly Optimized Approach O(nlogn) + space
    public static boolean slightlyOptimizedApproach(int[] num) {
        // sort array => then => check if same element present side by side or not
        int[] copyNum = num;
        Arrays.sort(copyNum);

        for (int i = 0; i < copyNum.length - 1; i++) {
            if(copyNum[i] == copyNum[i+1]){
                return true;
            }
        }
        return false;
    }

    // Fully Optimized Approach O(n)
    public static boolean fullyOptimizedApproach(int[] num) {
        // using hashset
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            // Check if element exist or not => then add if exist then return else add
            if(set.contains(num[i])){
                return true;
            }

            set.add(num[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 9};
        // System.out.println(Arrays.toString(num) + "\n" + bruteForceApproach(num));
        // System.out.println(Arrays.toString(num) + "\n" + slightlyOptimizedApproach(num));
        System.out.println(Arrays.toString(num) + "\n" + fullyOptimizedApproach(num));
    }
}
