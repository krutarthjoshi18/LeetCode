package com.greedy.hard;

/**
 * Created by krutarthjoshi on 2/25/17.
 */
public class ArrayPatches {


    public int minPatches(int[] nums, int n) {
        if (nums == null || n == 0) {
            return 0;
        }
        int l = nums.length;
        if (l == 0) {
            int result = (int) (Math.log(n) / Math.log(2.0));
            return (n & -n) == n ? result + 1 : result + 1;
        }
        int patch = 1;
        int result = 0;
        int i = 0;
        while (patch <= n) {
            if (i < l && nums[i] <= patch) {
                patch += nums[i++];
            } else {
                patch += patch;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}