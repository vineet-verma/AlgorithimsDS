package com.array;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] ar = {1, 7, 8, 5, 0, 6, 0, 2, 8};
        moveZeros(ar);
    }

    static void moveZeros(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        for (int j = count; j < arr.length; j++) {
            arr[j] = 0;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+",");
        }

    }
}
