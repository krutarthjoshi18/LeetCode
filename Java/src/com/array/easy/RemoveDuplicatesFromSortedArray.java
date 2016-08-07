package com.array.easy;

/**
 * Created by krutarthjoshi on 6/17/16.
 * LeetCode 26 - Remove Duplicates from Sorted Array
 * Given a sorted array, remove the duplicates in place such that
 * each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray refsa = new RemoveDuplicatesFromSortedArray();
        int[] input = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 10};
        int len = refsa.removeDuplicates(input);
        for (int i = 0; i < len; i++) {
            System.out.print(input[i] + " ");
        }
    }

    private int removeDuplicates(int[] A) {
        int l = A.length;
        if (l == 0) {
            return 0;
        }
        int slow = 0;
        int fast = 1;
        while (slow < l - 1) {
            if (A[slow + 1] == A[slow]) {
                slow++;
            } else {
                A[fast++] = A[++slow];
            }
        }
        return fast;
    }
}
