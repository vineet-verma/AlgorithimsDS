package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class HackerEarth {
    static void getTotalLikesAndDislikes(String a, String b) {
        if (a.length() != b.length()) {
            return;
        }
        int counter = 0;
        for (int i = 0, j = 0; i < a.length() && j < a.length(); i++, j++) {
            if (a.charAt(i) == b.charAt(j)) {
                counter++;
            }
        }
        System.out.println("Common likes and dislikes count is " + counter);
    }

    public static void main(String args[]) throws Exception {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String aString = br.readLine();                // Reading input from STDIN
        System.out.println("A's likes and dislikes, " + aString + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String bString = s.nextLine();                 // Reading input from STDIN
        System.out.println("B's likes and dislikes " + bString + ".");    // Writing output to STDOUT

        getTotalLikesAndDislikes(aString, bString);

        // Write your code here

    }
}
