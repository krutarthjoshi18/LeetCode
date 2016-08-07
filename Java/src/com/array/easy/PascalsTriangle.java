package com.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krutarthjoshi on 6/17/16.
 * LeetCode 118 - Pascal's Triangle
 * Given numRows, generate the first numRows of Pascal's triangle.
 * For example, given numRows = 5,
 * Return
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class PascalsTriangle {

    public static void main(String[] args) {
        PascalsTriangle pt = new PascalsTriangle();
        System.out.println(pt.generatePascalRow(5));
    }

    private List<List<Integer>> generatePascalRow(int n) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            row.add(0, 1);
            for (int j = 1; j < i; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            triangle.add(new ArrayList<>(row));
        }
        return triangle;
    }

}
