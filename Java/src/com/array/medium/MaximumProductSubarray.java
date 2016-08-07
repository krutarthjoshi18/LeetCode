package com.array.medium;

/**
 * Created by krutarthjoshi on 7/23/16.
 * LeetCode 152 - Maximum Product Subarray
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.
 * For example, given the array [2,3,-2,4],
 * the contiguous subarray [2,3] has the largest product = 6.
 */
public class MaximumProductSubarray {

    public static void main(String[] args) {
        MaximumProductSubarray mps = new MaximumProductSubarray();
        System.out.println(mps.maximumProduct(new int[]{-4, 1, 2, 3, -2}));
    }

    private int maximumProduct(int[] A) {
        if (A == null) {
            return 0;
        }
        int l = A.length;
        if (l == 0) {
            return 0;
        }
        int result = A[0];
        int min = result, max = result;
        for (int i = 1; i < l; i++) {
            if (A[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = max(A[i], max * A[i]);
            min = min(A[i], min * A[i]);
            result = max(result, max);
        }
        return result;
    }

    private int max(int A, int B) {
        return A > B ? A : B;
    }

    private int min(int A, int B) {
        return A > B ? B : A;
    }
}
