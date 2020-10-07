/*Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.*/
/*
* Input 1:
    A = [1, 2, 3, 4, -10]

Output 1:
    10

Explanation 1:
    The subarray [1, 2, 3, 4] has the maximum possible sum of 10.

Input 2:
    A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

Output 2:
    6

Explanation 2:
    The subarray [4,-1,2,1] has the maximum possible sum of 6.
*
* */
package com.array;

public class MaxContiguaousSubarraySum {
    static int maxSubArray(int a[]) {
        int max_so_far = a[0];
        int curr_max = a[0];
        for (int i = 1; i < a.length; i++) {
            curr_max = Math.max(a[i], curr_max + a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max_sum = maxSubArray(a);
        System.out.println("Maximum contiguous sum is "
                + max_sum);
    }
}
