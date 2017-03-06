package com.dynamicprogramming.medium;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 2/17/17.
 * LeetCode 494 - Target Sum
 * You are given a list of non-negative integers, a1, a2, ..., an, and a target, S.
 * Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.
 * Find out how many ways to assign symbols to make sum of integers equal to target S.
 * Example 1:
 * Input: nums is [1, 1, 1, 1, 1], S is 3.
 * Output: 5
 * Explanation:
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 * There are 5 ways to assign symbols to make the sum of nums be target 3.
 * Note:
 * The length of the given array is positive and will not exceed 20.
 * The sum of elements in the given array will not exceed 1000.
 * Your output answer is guaranteed to be fitted in a 32-bit integer.
 */
public class TargetSum {

    private int findTargetSumWays(int[] nums, int S) {
        if (nums == null) {
            return 0;
        }
        int targetSum = 0;
        for (int num : nums) {
            targetSum += num;
        }
        targetSum += S;
        if (targetSum % 2 != 0) {
            return 0;
        }
        return subsetSum(nums, targetSum / 2);
    }

    private int subsetSum(int[] nums, int sum) {
        int[] buffer = new int[sum + 1];
        buffer[0] = 1;
        for (int num : nums) {
            for (int i = sum; i >= num; i--) {
                buffer[i] += buffer[i - num];
            }
        }
        System.out.println(Arrays.toString(buffer));
        return buffer[sum];
    }

    public static void main(String[] args) {
        TargetSum ts = new TargetSum();
        System.out.println(ts.findTargetSumWays(new int[]{1, 2, 3, 4, 5}, 9));
    }
}
