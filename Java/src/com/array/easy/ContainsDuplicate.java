package com.array.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by krutarthjoshi on 6/2/16.
 * LeetCode 217 - Contains Duplicate
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] A = {3, 1};
        System.out.println(cd.containsDuplicateHashTable(A));
        System.out.println(cd.containsDuplicate(A));
    }

    private boolean containsDuplicate(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (!set.add(A[i])) {
                return true;
            }
            set.add(A[i]);
        }
        return false;
    }

    private boolean containsDuplicateHashTable(int[] A) {
        int l = A.length;
        int[][] hashTable = new int[2][l];
        for (int i = 0; i < l; i++) {
            int count = A[i];
            int index = count + l;
            index %= l;
            if (hashTable[0][index] == 1) {
                if (hashTable[1][index] == count) {
                    return true;
                } else {
                    index++;
                }
            } else {
                hashTable[0][index] = 1;
                hashTable[1][index] = count;
            }
        }
        return false;
    }
}
