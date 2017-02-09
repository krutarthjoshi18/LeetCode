package com.array.hard;

import java.util.HashSet;
import java.util.Set;
import java.util.SplittableRandom;

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
        int totalArea = 0;
        Set<String> points = new HashSet<>();
        for (int[] rectangle : rectangles) {
            totalArea += getArea(rectangle);
            String p1 = String.valueOf(rectangle[0]) + "," + String.valueOf(rectangle[1]);
            String p2 = String.valueOf(rectangle[2]) + "," + String.valueOf(rectangle[3]);
            if (points.contains(p1)) {
                points.remove(p1);
            } else {
                points.add(p1);
            }
            if (points.contains(p2)) {
                points.remove(p2);
            } else {
                points.remove(p2);
            }
        }
        return false;
    }

    private int getArea(int[] rectangle) {
        return (Math.abs(rectangle[0] - rectangle[2]) * Math.abs(rectangle[1] - rectangle[3]));
    }

}
