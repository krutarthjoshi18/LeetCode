package com.array.medium;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 11/7/16.
 */
public class SearchinaMatrix {

    public static void main(String[] args) {
        SearchinaMatrix searchinaMatrix = new SearchinaMatrix();
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(searchinaMatrix.searchMatrix(matrix, 17));
    }

    private boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int rowIndex = 0;
        while (rowIndex < m && matrix[rowIndex][0] < target) {
            rowIndex++;
        }
        rowIndex--;
        return !(Arrays.binarySearch(matrix[rowIndex], target) < 0);
    }
}
