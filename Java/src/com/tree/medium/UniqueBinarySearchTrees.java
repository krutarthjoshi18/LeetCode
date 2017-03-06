package com.tree.medium;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 3/5/17.
 */
public class UniqueBinarySearchTrees {

    private int numTrees(int n) {
        int[] numTrees = new int[n + 1];
        numTrees[0] = numTrees[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                numTrees[i] += numTrees[j - 1] * numTrees[i - j];
                System.out.println(Arrays.toString(numTrees));
            }
        }
        System.out.println(Arrays.toString(numTrees));
        return numTrees[n];
    }

    public static void main(String[] args) {
        UniqueBinarySearchTrees ubst = new UniqueBinarySearchTrees();
        ubst.numTrees(5);
    }
}
