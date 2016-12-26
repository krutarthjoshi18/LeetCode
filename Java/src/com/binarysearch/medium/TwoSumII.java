package com.binarysearch.medium;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 9/19/16.
 * LeetCode 167 - Two Sum II - Input array is sorted
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */

public class TwoSumII {

    public static void main(String[] args) {
        TwoSumII tsii = new TwoSumII();
        int[] input = {1, 2, 3, 4};
        System.out.println(Arrays.toString(tsii.twoSum(input, 0)));

    }

    private int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int j = search(numbers, i + 1, target - numbers[i]);
            if (j != -1) {
                return new int[]{i + 1, j + 1};
            }
        }
        throw new IllegalArgumentException("Invalid Input");
    }

    private int search(int[] input, int lo, int target) {
        int hi = input.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (input[mid] == target) {
                return mid;
            }
            if (input[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }
}
