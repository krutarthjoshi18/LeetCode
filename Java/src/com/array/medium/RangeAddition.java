package com.array.medium;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 9/29/16.
 * LeetCode 370 - Range Addition
 * Assume you have an array of length n initialized with all 0's and are given k update operations.
 * Each operation is represented as a triplet: [startIndex, endIndex, inc]
 * which increments each element of subarray A[startIndex ... endIndex] (startIndex and endIndex inclusive) with inc.
 * Return the modified array after all k operations were executed.
 * Example:
 * Given:
 * length = 5,
 * updates = [
 * [1,  3,  2],
 * [2,  4,  3],
 * [0,  2, -2]
 * ]
 * Output:
 * [-2, 0, 3, 5, 3]
 * Explanation:
 * Initial state:
 * [ 0, 0, 0, 0, 0 ]
 * After applying operation [1, 3, 2]:
 * [ 0, 2, 2, 2, 0 ]
 * After applying operation [2, 4, 3]:
 * [ 0, 2, 5, 5, 3 ]
 * After applying operation [0, 2, -2]:
 * [-2, 0, 3, 5, 3 ]
 */

public class RangeAddition {

    public static void main(String[] args) {
        RangeAddition ra = new RangeAddition();
        int[][] input = {{1, 3, 2}, {2, 4, 3}, {0, 2, -2}};
        System.out.println(Arrays.toString(ra.getModifiedArray(5, input)));
    }

    public int[] getModifiedArray(int length, int[][] updates) {
        int[] newArray = new int[length];
        for (int i = 0; i < updates.length; i++) {
            newArray[updates[i][0]] += updates[i][2];
            if (updates[i][1] + 1 < length) {
                newArray[updates[i][1] + 1] -= updates[i][2];
            }
        }
        for (int i = 1; i < length; i++) {
            newArray[i] += newArray[i - 1];
        }
        return newArray;
    }
}
