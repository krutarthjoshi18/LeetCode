package com.dynamicprogramming.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by krutarthjoshi on 1/29/17.
 * Write a boolean function that returns true if there is a subset that sums up to the target
 * Return false if no such subset is to be found
 * This is NP-Complete problem
 */
public class SubsetSum {

    private List<Integer> subsetSum(int[] input, int target) {
        if (input == null || target == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int l = input.length;
        if (l == 0) {
            return new ArrayList<>();
        }
        boolean[][] buffer = new boolean[l][target + 1];
        List<Integer> result = new ArrayList<>();
        Arrays.sort(input);
        for (int i = 0; i < l; i++) {
            buffer[i][0] = true;
        }
        for (int i = 0; i <= target; i++) {
            if (i > input[0]) {
                break;
            }
            if (i == input[0]) {
                buffer[0][i] = true;
            }
        }
        for (int i = 1; i < l; i++) {
            for (int j = 0; j <= target; j++) {
                if (buffer[i - 1][j]) {
                    buffer[i][j] = true;
                }
                if (j - input[i] >= 0 && buffer[i - 1][j - input[i]] == true) {
                    buffer[i][j] = true;
                }
            }
        }
        return buffer[l - 1][target] ? generateResultList(input, buffer, result) : new ArrayList<>();
    }

    private List<Integer> generateResultList(int[] input, boolean[][] buffer, List<Integer> result) {
        int i = buffer.length - 1, j = buffer[0].length - 1;
        while (i >= 0 && j >= 0 && buffer[i][j]) {
            while (i > 0 && buffer[i - 1][j]) {
                i--;
            }
            result.add(input[i]);
            j -= input[i];
            i--;

        }
        return result;
    }

    public static void main(String[] args) {
        SubsetSum ss = new SubsetSum();
        int[] input = {2, 4, 5};
        System.out.println(ss.subsetSum(input, 6));
    }
}
