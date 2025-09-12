/*
 * Problem Statement

    You are given an array of integers that may contain both positive and 
    negative numbers.
    A subarray means a sequence of consecutive elements taken from the array.

    Your task is to find the maximum sum that can be obtained from any subarray
    of the given array.
    In other words, you need to choose a part of the array 
    (one or more continuous elements) such that their sum is as large as 
    possible, and print that sum.

    Input: arr = [1, 2, 3]
    Output: 6

*/

import java.util.ArrayList;
import java.util.Arrays;

public class Array03_maxSubarraySum {
    // Brute Force Approach (O(n^3))
    public static int bruteForceApproach(ArrayList<Integer> num) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < num.size(); i++) {
            for (int j = i; j < num.size(); j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += num.get(k);
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    // Prefix Sum Approch (O(n^2))
    public static int prefixSumApproach(ArrayList<Integer> num) {
        ArrayList<Integer> prefix = new ArrayList<>();
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        prefix.add(num.get(0));

        for (int i = 1; i < num.size(); i++) {
            // prefix[i] = prefix[i-1] + arr[i]
            prefix.add(prefix.get(i - 1) + num.get(i)); 
        }

        for (int i = 0; i < num.size(); i++) {
            for (int j = i; j < num.size(); j++) {

                if (i == 0) {
                    // currentSum = prefix[end]
                    currSum = prefix.get(j);
                } else {
                    // currentSum = prefix[end] - prefix[start-1]
                    currSum = prefix.get(j) - prefix.get(i - 1);
                }

                maxSum = Math.max(maxSum, currSum);
            }
        }

        // System.out.println(prefix);
        return maxSum;
    }

    // Kedan's Algo (O(n))
    public static int kedanAlgo(ArrayList<Integer> num) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean isNegative = true; // by default we assume that array is negative

        // handling case where whole array is negative number
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) > 0) {
                isNegative = false;
            }
        }

        if (!isNegative) {
            for (int i = 0; i < num.size(); i++) {
                currSum = currSum + num.get(i);
                if (currSum < 0) {
                    currSum = 0;
                }

                maxSum = Math.max(maxSum, currSum);
            }
            return maxSum;
        } else {
            for(int i = 0; i < num.size(); i++){
                // return the maxium number among all negative numbers
                maxSum = Math.max(maxSum, num.get(i));
            }
            return maxSum;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        // num.addAll(Arrays.asList(1, 2, 3));
        num.addAll(Arrays.asList(1, -2, 3, -4, 5));
        // num.addAll(Arrays.asList(-1, -2, -3, -4, -5));

        // int maxSum = bruteForceApproach(num);
        // int maxSum = prefixSumApproach(num);
        int maxSum = kedanAlgo(num);

        System.out.println("Max Sub Array Sum: " + maxSum);
    }
}
