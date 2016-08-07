package com.array.medium;

/**
 * Created by krutarthjoshi on 8/1/16.
 */
public class UniquePaths {

    public static void main(String[] args) {
        UniquePaths up = new UniquePaths();
        System.out.println(up.combinationUniquePaths(15, 15));
        System.out.println(up.dynamicUniquePaths(15, 15));
    }

    private int combinationUniquePaths(int m, int n) {
        long s = System.nanoTime();
        double maxPaths = 1;
        int num = m + n - 2;
        int den = n - 1;
        int topLimit = num > 2 * den ? num - den : den;
        int botLimit = num > 2 * den ? den : num - den;
        for (int i = num, j = botLimit; i > topLimit; i--, j--) {
            maxPaths *= i;
            maxPaths /= j;
        }
        System.out.println(System.nanoTime() - s);
        return (int) Math.round(maxPaths);
    }

    private int dynamicUniquePaths(int m, int n) {
        long s = System.nanoTime();
        int[][] grid = new int[m][n];
        int len = m > n ? m : n;
        for (int i = 0; i < len; i++) {
            grid[i % m][0] = 1;
            grid[0][i % n] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
            }
        }
        System.out.println(System.nanoTime() - s);
        return grid[m - 1][n - 1];
    }
}
