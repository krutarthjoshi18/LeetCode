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

    private void mergeSortedArray(int[] A, int[] B, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k] = A[i];
                i--;
            } else {
                A[k] = B[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            A[k] = B[j];
            j--;
            k--;
        }
    }
}
