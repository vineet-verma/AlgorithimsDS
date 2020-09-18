package com.array;

import java.util.HashSet;
/*
* Algorithm:

Initialize an empty hash set s.
Do following for each element A[i] in A[]
If s[x – A[i]] is set then print the pair (A[i], x – A[i])
Insert A[i] into s.
* */
public class FindPairGivenSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 6, 34, 23, 5,9,10,-23};
        int sum = 11;
        printPair(a, sum);
    }

    public static void printPair(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = sum - arr[i];
            if (set.contains(diff)) {
                System.out.println("("+arr[i]+","+diff+")");
            }
            set.add(arr[i]);

        }

    }

}
