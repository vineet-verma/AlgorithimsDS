/*
Problem Description

        Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].



        Input Format
        First and only argument is an integer array A.



        Output Format
        Return an integer denoting the maximum value of j - i;



        Example Input
        Input 1:

        A = [3, 5, 4, 2]

        [12,1,14,5,7,1,9,4,0]
        Example Output
        Output 1:

        2


        Example Explanation
        Explanation 1:

        Maximum value occurs for pair (3, 4).

        Approach - o(nlogn)
        space - o(n)
Traverse the array and store the index of each element in a list (to handle duplicates).
Sort the array.
Now traverse the array and keep track of the maximum difference of i and j.
For j consider the last index from the list of possible index of the element and for i consider the first index from the list. (As the index were appended in ascending order).
Keep updating the max difference till the end of array.
filter_none
        [34,8,10,3,2,80,30,33,1]
        0  1  2 3 4 5  6  7  8

        [1,2,3,8,10,30,33,34,80]
*/


package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayMaxDistance {
    static int getMax(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    static int findMaxDistance(int[] a) {
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            indexMap.put(a[i], i);
        }
        Arrays.sort(a);
        int maxDiff = 0;
        int temp = a.length;
        for (int i = 0; i < a.length; i++) {
            if (temp > indexMap.get(a[i])) {
                temp = indexMap.get(a[i]);
            }
            maxDiff = getMax(maxDiff, indexMap.get(a[i]) - temp);
        }
        return maxDiff;

    }
    /*Maximum value occurs for pair (3, 4).
            [34,8,10,3,2,80,30,33,1]
            0  1  2 3 4 5  6  7  8

            [1,2,3,8,10,30,33,34,80]*/

    public static void main(String[] args) {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(findMaxDistance(arr));
    }
}
