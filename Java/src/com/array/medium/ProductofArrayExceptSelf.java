package com.array.medium;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 6/22/16.
 * LeetCode 238 - Product of Array Except Self
 * Given an array of n integers where n > 1, nums,
 * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * Solve it without division and in O(n).
 * For example, given [1,2,3,4], return [24,12,8,6].
 * Follow up:
 * Could you solve it with constant space complexity?
 * (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductofArrayExceptSelf {

    public static void main(String[] args) {
        ProductofArrayExceptSelf paes = new ProductofArrayExceptSelf();
        int[] input = {1, 2, 3, 4, 0};
        System.out.println(Arrays.toString(paes.productExceptSelf(input)));
    }

    private int[] productExceptSelf(int[] input) {
        if (input == null) {
            return new int[]{};
        }
        int l = input.length;
        if (l == 0) {
            return input;
        }
        int temp = 1;
        int[] result = new int[l];
        result[0] = 1;
        for (int i = 1; i < l; i++) {
            temp *= input[i - 1];
            result[i] = temp;
        }
        temp = 1;
        for (int i = l - 2; i >= 0; i--) {
            temp *= input[i + 1];
            result[i] *= temp;
        }
        return result;
    }
}
