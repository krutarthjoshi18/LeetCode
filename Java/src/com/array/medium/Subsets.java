package com.array.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krutarthjoshi on 7/21/16.
 * LeetCode 78 - Subsets
 * Given a set of distinct integers, nums, return all possible subsets.
 * Note: The solution set must not contain duplicate subsets.
 * For example,
 * If nums = [1,2,3], a solution is:
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 */
public class Subsets {

    public static void main(String[] args) {
        Subsets s = new Subsets();
        System.out.println(s.generateSubsets(new int[]{1, 2, 3}));
    }

    private List<List<Integer>> generateSubsets(int[] A) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        allSubsets.add(new ArrayList<>());
        for (int i = 0; i < A.length; i++) {
            List<List<Integer>> currentSetSubset = new ArrayList<>();
            for (List<Integer> tempList : allSubsets) {
                List<Integer> currentSet = new ArrayList<>(tempList);
                currentSet.add(A[i]);
                currentSetSubset.add(currentSet);
            }
            allSubsets.addAll(currentSetSubset);
        }
        return allSubsets;
    }
}
