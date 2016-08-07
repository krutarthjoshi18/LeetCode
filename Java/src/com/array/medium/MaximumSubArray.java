package com.array.medium;

/**
 * Created by krutarthjoshi on 6/23/16.
 * LeetCode 53 - Maximum Subarray
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 */
public class MaximumSubArray {

    public static void main(String[] args) {
        MaximumSubArray msa = new MaximumSubArray();
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(msa.maxSum(input));
    }

    private int maxSum(int[] A) {
        if (A == null) {
            return 0;
        }
        int l = A.length;
        if (l == 0) {
            return 0;
        }
        int max = A[0];
        int result = max;
        for (int i = 1; i < l; i++) {
            int curr = A[i];
            max = max > 0 ? max + curr : curr;
            result = result > max ? result : max;
        }
        return result;
    }
}
