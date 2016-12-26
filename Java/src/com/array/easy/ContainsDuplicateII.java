package com.array.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by krutarthjoshi on 6/21/16.
 * LeetCode 219 - Contains Duplicate II
 * Given an array of integers and an integer k,
 * find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
 * and the difference between i and j is at most k.
 */
public class ContainsDuplicateII {

    public static void main(String[] args) {
        ContainsDuplicateII cdii = new ContainsDuplicateII();
        int[] input = {1, 2, 3, 4, 1, 3};
        System.out.println(cdii.containsWindowedDuplicate(input, 3));
        System.out.println(cdii.containsWindowedDuplicateHashSet(input, 3));
    }

    private boolean containsWindowedDuplicate(int[] A, int k) {
        int l = A.length;
        int[][] hashTable = new int[3][l];
        for (int i = 0; i < l; i++) {
            int num = A[i];
            int index = num + l;
            index %= l;
            while (hashTable[0][index] != 0) {
                if (hashTable[1][index] == num && hashTable[2][index] + k >= i) {
                    return true;
                } else if (hashTable[1][index] == num) {
                    break;
                } else {
                    index = (index + 1) % l;
                }
            }
            hashTable[0][index] = 1;
            hashTable[1][index] = num;
            hashTable[2][index] = i;
        }
        return false;
    }

    private boolean containsWindowedDuplicateHashSet(int[] A, int windowLength) {
        Set<Integer> window = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (i - windowLength > 0) {
                window.remove(A[i - windowLength - 1]);
            }
            if (!window.add(A[i])) {
                return true;
            }
        }
        return false;
    }
}
