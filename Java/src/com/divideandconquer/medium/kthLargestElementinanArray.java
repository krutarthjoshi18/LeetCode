package com.divideandconquer.medium;

/**
 * Created by krutarthjoshi on 9/7/16.
 */
public class kthLargestElementinanArray {

    public static void main(String[] args) {
        kthLargestElementinanArray kleia = new kthLargestElementinanArray();
        int[] input = {1, 4, 3, 2, 5, 6, 19, 76};
        System.out.println(kleia.findkthLargest(input, 54));
    }

    private int findkthLargest(int[] nums, int k) {
        if (nums == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int l = nums.length;
        if (l == 0) {
            throw new IllegalArgumentException("Empty Array");
        }
        if (k > l) {
            throw new IllegalArgumentException("k greater than length of Array");
        }
        return 0;
    }
}
