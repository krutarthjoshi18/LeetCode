package com.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krutarthjoshi on 6/24/16.
 * LeetCode 119 - Pascal's Triangle II
 * Given an index k, return the kth row of the Pascal's triangle.
 * For example, given k = 3,
 * Return [1,3,3,1].
 */
public class PascalTriangleII {

    public static void main(String[] args) {
        PascalTriangleII psii = new PascalTriangleII();
        long s = System.nanoTime();
        System.out.println(psii.generateRowCombination(40));
        System.out.println(System.nanoTime() - s + " MyTime");
        s = System.nanoTime();
        System.out.println(psii.generateRow(40));
        System.out.println(System.nanoTime() - s + " ChoduTime");
    }

    private List<Integer> generateRowCombination(int n) {
        List<Integer> row = new ArrayList<>(n + 1);
        row.add(1);
        double num = 1;
        for (int i = 1; i <= n; i++) {
            num = (num / i * (n - i + 1) + 0.1);
            row.add((int) num);
        }
        return row;
    }

    private List<Integer> generateRow(int n) {
        n += 1;
        List<Integer> row = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            row.add(0, 1);
            for (int j = 1; j < i; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
        }
        return row;
    }
}
