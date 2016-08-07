package com.array.medium;

/**
 * Created by krutarthjoshi on 7/27/16.
 * LeetCode 162 - Find Peak Element
 * A peak element is an element that is greater than its neighbors.
 * Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 * You may imagine that num[-1] = num[n] = -∞.
 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 */
public class FindPeakElement {

    public static void main(String[] args) {
        FindPeakElement fpe = new FindPeakElement();
        System.out.println(fpe.findPeakElement(new int[]{1, 2, 3, 4, 5, 6, 1}));
    }

    private int findPeakElement(int[] A) {
        if (A == null) {
            return -1;
        }
        int l = A.length;
        if (l == 0) {
            return -1;
        }
        int low = 0;
        int high = l - 1;
        while (low < high - 1) {
            int mid = (low + high) / 2;
            if (A[mid - 1] < A[mid] && A[mid + 1] < A[mid]) {
                return mid;
            } else if (A[mid] < A[mid - 1]) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return A[0] > A[l - 1] ? 0 : l - 1;
    }
}
