package com.array.medium;

/**
 * Created by krutarthjoshi on 6/23/16.
 * LeetCode 268 - Missing Number
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * Note:
 * Your algorithm should run in linear runtime complexity.
 * Could you implement it using only constant extra space complexity?
 */
public class MissingNumber {

    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] input = {1, 2, 0, 3};
        System.out.println(mn.getMissingNumber(input));

    }

    private int getMissingNumber(int[] A) {
        int result = 0;
        int l = A.length;
        for (int i = 0; i < l; i++) {
            result ^= A[i] ^ (i + 1);
        }
        return result;
    }
}
