package com.divideandconquer.medium;

/**
 * Created by krutarthjoshi on 9/7/16.
 */
public class kthLargestElementinanArray {

    public static void main(String[] args) {
        kthLargestElementinanArray kleia = new kthLargestElementinanArray();
        int[] input = {1, 4, 3, 2, 5, 6, 19, 76};
        System.out.println(kleia.findkthLargest(input, 4));
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
        k = nums.length - k;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            final int j = partition(nums, lo, hi);
            if (j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }

    private int partition(int[] a, int lo, int hi) {

        int i = lo;
        int j = hi + 1;
        while (true) {
            while (i < hi && less(a[++i], a[lo])) ;
            while (j > lo && less(a[lo], a[--j])) ;
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private void exch(int[] a, int i, int j) {
        final int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private boolean less(int v, int w) {
        return v < w;
    }
}
