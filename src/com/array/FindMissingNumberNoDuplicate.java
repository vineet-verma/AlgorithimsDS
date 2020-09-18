package com.array;

/*
Given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in list.
One of the integers is missing in the list. Write an efficient code to find the missing integer.

Examples:

Input : arr[] = [1, 2, 3, 4, 6, 7, 8]
Output : 5

Input : arr[] = [1, 2, 3, 4, 5, 6, 8, 9]
Output : 7
* */
public class FindMissingNumberNoDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};
        getMissingNosBinarySearch(arr, arr.length);
    }
    //o(n) solution
    static void getMissingNos(int a[], int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] - i > 1) {
                System.out.println(i + 1);
            }
        }
    }
//o(logn) solution
    static void getMissingNosBinarySearch(int a[], int n) {
        int l = 0, r = n - 1;
        int mid = 0;
        while ((r-l) > 1) {
            mid = (l + r) / 2;
            if ((a[l] - l) != (a[mid] - mid)) {
                r = mid;
            }
            if ((a[r] - l) != (a[mid] - mid)) {
                l = mid;
            }
        }
        System.out.println(a[mid]+1);
    }
}
