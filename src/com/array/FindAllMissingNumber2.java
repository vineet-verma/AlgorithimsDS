package com.array;

/*
* Find all missing numbers from a given sorted array
Given a sorted array arr[] of N integers, The task is to find the multiple missing elements in the array
*  between the ranges [arr[0], arr[N-1]].

Examples:

Input: arr[] = {6, 7, 10, 11, 13}
Output: 8 9 12
Explanation:
The elements of the array are present in the range of the maximum and minimum array element [6, 13]. Therefore, the total values will be {6, 7, 8, 9, 10, 11, 12, 13}.
The elements from the above range which are missing from the array are {8, 9, 12}.

Input: arr[] = {1, 2, 4, 6}
Output: 3 5

* */
public class FindAllMissingNumber2 {
    public static void main(String[] args) {
        int[] arr = {6, 7, 10, 11, 13};
        getMissingNos(arr, arr.length);
    }

    static void getMissingNos(int a[], int n) {
        int maxElem = a[n - 1];
        int[] proArr = new int[maxElem + 1];
        for (int i = 0; i < n; i++) {
            proArr[a[i]] = 1;
        }

    }
}
