package com.array.easy;

/**
 * Created by krutarthjoshi on 6/16/16.
 * LeetCode 283 - Move Zeroes
 * Given an array nums, write a function to move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {

    public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        int[] in = {1, 2, 0, 5, 6, 0, 0, 4};
        mz.moveZeroes(in);
        for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }
    }

    private void moveZeroes(int[] A) {
        int fast = 0;
        int n = A.length;
        for (int slow = 0; slow < n; slow++) {
            if (A[slow] != 0) {
                A[fast] = A[slow];
                fast++;
            }
        }
        for (int i = fast; i < n; i++) {
            A[i] = 0;
        }
    }
}
