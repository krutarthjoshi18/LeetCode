package com.dynamicprogramming.easy;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 8/20/16.
 */
public class RangeSumQueryImmutable {

    private int[] nums;
    private int[] sum;

    public RangeSumQueryImmutable(int[] nums) {
        this.nums = nums;
        int l = nums.length;
        int[] sum = new int[l + 1];
        this.sum = sum;
        int temp = 0;
        for (int i = 1; i < l + 1; i++) {
            temp += nums[i - 1];
            sum[i] = temp;
        }
    }

    public int rangeSum(int i, int j) {
        System.out.println(Arrays.toString(sum));
        return sum[j + 1] - sum[i];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable rsqi = new RangeSumQueryImmutable(nums);
        System.out.println(rsqi.rangeSum(2, 5));
    }
}
