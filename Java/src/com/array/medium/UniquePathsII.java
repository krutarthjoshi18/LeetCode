package com.array.medium;

/**
 * Created by krutarthjoshi on 9/12/16.
 * LeetCode 63 - Unique Paths II
 * Follow up for "Unique Paths":
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * For example,
 * There is one obstacle in the middle of a 3x3 grid as illustrated below.
 * [
 * [0,0,0],
 * [0,1,0],
 * [0,0,0]
 * ]
 * The total number of unique paths is 2.
 * Note: m and n will be at most 100.
 */
public class UniquePathsII {

    public static void main(String[] args) {
        UniquePathsII upii = new UniquePathsII();
        int[][] input = {{0, 0}};
        System.out.println(upii.uniquePathsWithObstacles(input));
    }

    private int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            grid[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            grid[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    continue;
                }
                grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
            }
        }
        return grid[m - 1][n - 1];
    }
}
