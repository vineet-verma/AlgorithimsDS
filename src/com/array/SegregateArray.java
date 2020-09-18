package com.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
* Given an array A[], write a program that segregates even and odd numbers. The program should put all even numbers first in sorted order,
*  and then odd numbers in sorted order.

Input:
The first line of input contains an integer T, denoting the number of test cases. For each testcase there will be two lines of input:
* The first line contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
For each testcase, print the segregated array.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 105
0 ≤A[i]<=105

Example:
Input:
2
7
12 34 45 9 8 90 3
5
0 1 2 3 4
Output:
8 12 34 90 3 9 45
0 2 4 1 3
*
*
*
* */
public class SegregateArray {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(bufferedReader.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            int[] arr = new int[n];
            inputLine = bufferedReader.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            new Solution().segregateEvenOdd(arr,n);
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]+ " ");
            }
        }
    }
}

class Solution {

    void segregateEvenOdd(int arr[], int n) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenList.add(arr[i]);
            } else {
                oddList.add(arr[i]);
            }
        }

        int k = 0;
        for (int i : evenList) {
            arr[k++] = i;
        }
        for (int i : oddList) {
            arr[k++] = i;
        }
        // code here
    }
}