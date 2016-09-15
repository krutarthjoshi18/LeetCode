package com.array.hard;

/**
 * Created by krutarthjoshi on 8/31/16.
 * LeetCode 287 - Find the Duplciate Number
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
 * prove that at least one duplicate number must exist. Assume that there is only one duplicate number,
 * find the duplicate one.
 * Note:
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once.
 */
public class FindtheDuplicateNumber {

    public static void main(String[] args) {
        FindtheDuplicateNumber fdn = new FindtheDuplicateNumber();
        int[] input = {1, 2, 3, 4, 5, 5, 5};
        System.out.println(fdn.duplicateNumber(input));
    }

    private int duplicateNumber(int[] A) {
        if (A == null) {
            return 0;
        }
        int l = A.length;
        if (l == 0) {
            return 0;
        }
        int slow = l, fast = slow;
        while (true) {
            slow = A[slow - 1];
            fast = A[A[fast - 1] - 1];
            if (slow == fast) break;
        }
        slow = l;
        while (true) {
            if (slow == fast) break;
            slow = A[slow - 1];
            fast = A[fast - 1];
        }
        return slow;
    }
}
