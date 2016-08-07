package com.array.easy;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 6/22/16.
 * LeetCode 189 - Rotate Array
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class RotateArray {

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int[] input1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] input2 = input1.clone();
        int[] input3 = input1.clone();
        ra.elegantRotate(input1, 2);
        ra.rotatewithNoExtraSpace(input2, 2);
        ra.laeddisSoln(input3, 3);
        System.out.println(Arrays.toString(input1));
        System.out.println(Arrays.toString(input2));
        System.out.println(Arrays.toString(input3));
    }

    private void elegantRotate(int[] A, int k) {
        int l = A.length;
        int[] temp = new int[l];
        for (int i = 0; i < l; i++) {
            temp[(i + k) % l] = A[i];
        }
        for (int i = 0; i < l; i++) {
            A[i] = temp[i];
        }
    }

    private void laeddisSoln(int[] A, int k) {
        if (A.length == 0 || k % A.length == 0) return;
        int start = 0, i = start, curNum = A[i], count = 0;
        while (count < A.length) {
            i = (i + k) % A.length;
            int tmp = A[i];
            A[i] = curNum;
            if (i == start) {
                start++;
                i = start;
                curNum = A[i];
            } else curNum = tmp;
            count++;
        }

    }

    private void rotatewithNoExtraSpace(int[] A, int k) {
        int l = A.length;
        k %= l;
        reverse(A, 0, l - 1);
        reverse(A, 0, k - 1);
        reverse(A, k, l - 1);
    }

    private void reverse(int[] A, int start, int stop) {
        while (start < stop) {
            int temp = A[start];
            A[start] = A[stop];
            A[stop] = temp;
            start++;
            stop--;
        }
    }
}
