package com.array;

/*
* You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
Example:


Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
Output: 5
Explanation: The missing number from 1 to 8 is 5

Input: arr[] = {1, 2, 3, 5}
Output: 4
Explanation: The missing number from 1 to 5 is 4

* */
public class FindAllMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 6};
        getMissingNos(arr, arr.length);
    }

    static void getMissingNos(int a[], int n) {
        for (int i = 0; i < n; i++) {
            int temp = Math.abs(a[i])-1 ;
            if (a[temp] > 0) {
                a[temp] = -a[temp];
            } else {
                a[temp] = a[temp];
            }
        }
        for (int i = 0; i < n; i++) {
            // Current element was not present
            // in the original vector
            if (a[i] > 0)
                System.out.print(i + 1 + " ");
        }
    }
}
