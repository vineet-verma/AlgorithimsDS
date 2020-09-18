package com.array;

import java.util.HashMap;
import java.util.HashSet;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7};
        int b[] = {2, 4, 6, 8};
        mergeArray(a, b);
    }

    public static void mergeArray(int[] a, int[] b) {
        int i = 0, j = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        while (i < a.length && j < b.length) {
            set.add(a[i]);
            set.add(b[j]);
            i++;
            j++;

        }
        set.stream().forEach(integer -> System.out.println(integer));

    }
}
