package com.array.hard;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by krutarthjoshi on 11/17/16.
 */
public class PerfectRectangle {

    public static void main(String[] args) {
        PerfectRectangle perfectRectangle = new PerfectRectangle();
        int[][] rectangles = {{1, 2, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4}, {2, 3, 3, 4}};
        System.out.println(perfectRectangle.isRectangleCover(rectangles));
    }

    public boolean isRectangleCover(int[][] rectangles) {
        if (rectangles == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int l = rectangles.length;
        if (l == 0) {
            return true;
        }
        Set<String> set = new HashSet<>();
        int minX;
        int minY;
        int maxX;
        int maxY;
        return false;
    }

    private int getArea(int[] rectangle) {
        return 0;
    }

}
