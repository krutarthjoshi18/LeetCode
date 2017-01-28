package com.array.easy;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 6/21/16.
 * LeetCode 88 - Merge Sorted Array
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        MergeSortedArray msa = new MergeSortedArray();
        int[] A = {4, 5, 6, 0, 0, 0};
        int[] B = {1, 2, 3};
        msa.mergeSortedArray(A, B, 3, 3);
        System.out.println(Arrays.toString(A));
    }

    private void mergeSortedArray(int[] nums1, int[] nums2, int m, int n) {
        if (nums1 == null || nums2 == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        return;
    }
}
