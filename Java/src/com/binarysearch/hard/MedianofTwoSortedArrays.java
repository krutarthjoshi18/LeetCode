package com.binarysearch.hard;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Created by krutarthjoshi on 11/6/16.
 */
public class MedianofTwoSortedArrays {

    public static void main(String[] args) {
        MedianofTwoSortedArrays medianofTwoSortedArrays = new MedianofTwoSortedArrays();
        int[] A = {3, 9};
        int[] B = {1, 2, 4, 5, 6, 7, 8, 10};
        System.out.println(medianofTwoSortedArrays.findMedianSortedArrays(A, B));
    }

    public double findMedianSortedArrays(int A[], int B[]) {
        int m = A.length;
        int n = B.length;

        if (m > n)
            return findMedianSortedArrays(B, A);

        int k = (m + n - 1) / 2;
        int l = 0, r = min(k, m);
        while (l < r) {
            int midA = (l + r) / 2;
            int midB = k - midA;
            if (A[midA] < B[midB])
                l = midA + 1;
            else
                r = midA;
        }

        int a = Integer.MIN_VALUE;
        if (l - 1 >= 0) {
            a = A[l - 1];
        }
        if (k - l >= 0) {
            a = max(a, B[k - l]);
        }
        boolean isOdd = (m + n) % 2 == 1;
        if (isOdd) {
            return (double) a;
        }

        int b = Integer.MAX_VALUE;
        if (l <= m - 1) {
            b = A[l];
        }
        if (k - l + 1 <= n - 1) {
            b = min(b, B[k - l + 1]);
        }
        return (a + b) / 2.0;
    }
}
