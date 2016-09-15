package com.array.hard;

/**
 * Created by krutarthjoshi on 8/31/16.
 * LeetCode 41 - First Missing Positive
 * Given an unsorted integer array, find the first missing positive integer.
 * For example,
 * Given [1,2,0] return 3,
 * and [3,4,-1,1] return 2.
 * Your algorithm should run in O(n) time and uses constant space.
 */
public class FindMissingPositive {

    public static void main(String[] args) {
        FindMissingPositive fmp = new FindMissingPositive();
        int[] input = {1, 2, 2, 0};
        System.out.println(fmp.firstMissingPositive(input));
    }

    private int firstMissingPositive(int[] A) {
        int sum = 0;
        int count = 0;
        for (int currentNum : A) {
            if (currentNum > 0) {
                count++;
                sum += currentNum;
            }
        }
        int total = (count + 1) * (count + 2) / 2;
        return total - sum;
    }
}
