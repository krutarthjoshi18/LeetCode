package com.array.easy;

/**
 * Created by krutarthjoshi on 6/17/16.
 * LeetCode 27 - Remove Element
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * Your function should return length = 2, with the first two elements of nums being 2.
 */
public class RemoveElement {

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] input = {3, 3};
        re.removeElement(input, 3);

    }

    private int removeElement(int[] A, int target) {
        int targetCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != target) {
                A[targetCount] = A[i];
                targetCount++;
            }
        }
        return targetCount;
    }
}
