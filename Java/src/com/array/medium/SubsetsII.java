package com.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by krutarthjoshi on 7/21/16.
 */
public class SubsetsII {

    public static void main(String[] args) {
        SubsetsII sbii = new SubsetsII();
        System.out.println(sbii.uniqueSubsets(new int[]{1, 2, 2, 3}));
    }

    private List<List<Integer>> uniqueSubsets(int[] A) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        allSubsets.add(new ArrayList<>());
        return allSubsets;
    }
}
