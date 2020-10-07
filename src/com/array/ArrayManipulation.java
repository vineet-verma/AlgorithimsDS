package com.array;

import java.io.IOException;
import java.util.Arrays;

public class ArrayManipulation {
    // Complete the arrayManipulation function below.
    public static long arrayManipulation(int n, int[][] queries) {

        int[] processArr = new int[n];
        int j = 0;
        for (int i = 0; i < queries.length; i++) {
            j = 0;
            addArrayValues(processArr, queries[i][j], queries[i][j + 1], queries[i][j + 2]);
        }
        Arrays.sort(processArr);
        return processArr[processArr.length - 1];
    }

    public static void addArrayValues(int[] processArr, int startIndex, int endIndex, int k) {
        for (int i = startIndex; i <= endIndex; i++) {
            processArr[i - 1] = processArr[i - 1] + k;
        }
        System.out.println();
        for (int i = 0; i < processArr.length; i++) {
            System.out.print(processArr[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {

       /* BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }*/

        int[][] queries = {{
                1, 2, 100
        },
                {
                        2, 5, 100
                },
                {
                        3, 4, 100
                }};
        long result = arrayManipulation(5, queries);

        System.out.println("MAX ELEMENT "+ result);
       /* bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/
    }
}

