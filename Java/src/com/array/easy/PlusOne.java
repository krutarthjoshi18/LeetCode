package com.array.easy;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 6/17/16.
 * LeetCode 66 - Plus One
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {

    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] input = {9, 8, 9, 9};
        int[] output = po.plusOne(input);
        System.out.println(Arrays.toString(output));

    }

    private int[] plusOne(int[] A) {
        int l = A.length;
        int i = l - 1;
        while (A[i] == 9) {
            if (i == 0) {
                int[] result = new int[l + 1];
                result[0] = 1;
                return result;
            }
            A[i] = 0;
            i--;
        }
        A[i]++;
        return A;
    }
}
