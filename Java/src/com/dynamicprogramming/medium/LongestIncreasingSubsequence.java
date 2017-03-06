package com.dynamicprogramming.medium;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 2/20/17.
 */
public class LongestIncreasingSubsequence {

    private int lengthofLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = nums.length;
        int[] dp = new int[l];
        Arrays.fill(dp, 1);
        int lo = 0, hi = 0;
        int result = 1;
        while (lo < l) {
            if (lo == hi) {
                lo = 0;
                hi++;
                if (hi == l) {
                    break;
                }
            }
            if (nums[lo] < nums[hi]) {
                dp[hi] = Math.max(dp[hi], dp[lo] + 1);
                result = Math.max(result, dp[hi]);
            }
            lo++;
        }
        return result;
    }
}
