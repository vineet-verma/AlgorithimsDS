package com.array;

import java.util.ArrayList;

public class AddOneToNumberArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(8);
        list.add(9);
        list.add(9);
        list.add(0);
        plusOne(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        addOneSum(A, A.size());
        int i = 0;
        while (i < A.size() - 1 && A.get(i) == 0) {
            A.remove(i);
        }
        return A;
    }

    public static void addOneSum(ArrayList<Integer> list, int n) {
        int i = n;
        if (i == 0) {
            list.add(i, 1);
            return;
        }
        int lastEl = list.get(i - 1);
        if (lastEl < 9) {
            list.set(i - 1, lastEl + 1);
            return;
        }
        list.set(i - 1, 0);
        i--;
        addOneSum(list, i);
    }
}
