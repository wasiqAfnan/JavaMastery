/*
 * Problem Statement

    Given an array of integers, write a program to find and display all possible 
    pairs of elements from the array. Each pair should consist of two distinct 
    elements, and the order of elements in a pair does not matter (i.e., (a, b) 
    is considered the same as (b, a)).

    Input: arr = [1, 2, 3]
    Output: (1, 2), (1, 3), (2, 3) 
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Array01_pairsInArray {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(1,2,3));

        for(int i = 0; i < num.size(); i++){
            for(int j = i+1; j < num.size(); j++){
                System.out.print("(" + num.get(i) + "," + num.get(j) + ")");
            }
        }
    }
}
