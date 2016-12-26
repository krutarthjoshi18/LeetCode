package com.array.hard;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 11/18/16.
 * LeetCode 128 - Longest Consecutive Sequence
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * Your algorithm should run in O(n) complexity.
 */
public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] input = {100, 4, 200, 1, 3, 2, 1};
        System.out.println(longestConsecutiveSequence.longestConsecutive(input));
    }

    public int longestConsecutive(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int l = nums.length;
        if (l == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int maxLength = 1;
        int currLength = 1;

        for (int i = 1; i < l; i++) {
            if (nums[i - 1] == nums[i]) {
                continue;
            } else if (nums[i - 1] + 1 == nums[i]) {
                currLength++;
                maxLength = Math.max(maxLength, currLength);
            } else {
                currLength = 1;
            }
        }
        return maxLength;
    }
}
