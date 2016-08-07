package com.array.medium;

/**
 * Created by krutarthjoshi on 8/1/16.
 * LeetCode 153 - Find Minimum in Rotated Sorted Array
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * Find the minimum element.
 * You may assume no duplicate exists in the array.
 */
public class FindMinimuminRotatedSortedArray {

    public static void main(String[] args) {
        FindMinimuminRotatedSortedArray fmirsa = new FindMinimuminRotatedSortedArray();
        System.out.println(fmirsa.findMin(new int[]{2, 3, 1}));
    }

    private int findMin(int[] A) {
        if (A == null) {
            return 0;
        }
        int l = A.length;
        if (l == 0) {
            return 0;
        }
        if (l == 1) {
            return A[0];
        }
        if (l == 2) {
            return A[0] > A[1] ? A[0] : A[1];
        }
        int lo = 0;
        int hi = l - 1;
        if (A[lo] < A[hi]) {
            return A[lo];
        }
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid > 0 && A[mid] < A[mid - 1]) {
                return A[mid];
            }
            if (A[lo] <= A[mid] && A[mid] > A[hi]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}
