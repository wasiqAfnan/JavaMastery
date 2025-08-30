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
    public static void main(String[] args) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(1, 2, 3));

        for(int i = 0; i < num.size(); i++){
            for(int j = i; j < num.size(); j++){
                currSum = 0;
                for(int k = i; k <= j; k++){
                    currSum += num.get(k);
                }
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sub Array Sum: " + maxSum);
    }
}
