package com.array.easy;

/**
 * Created by krutarthjoshi on 1/28/17.
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * Note:
 * The input array will only contain 0 and 1
 * The length of input array is a positive integer and will not exceed 10,000
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int l = nums.length;
        if (l == 0) {
            return 0;
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
