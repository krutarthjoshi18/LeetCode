package com.array.hard;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by krutarthjoshi on 11/17/16.
 */
public class PerfectRectangle {

    public static void main(String[] args) {
        PerfectRectangle perfectRectangle = new PerfectRectangle();
        int[][] rectangles = {{1, 1, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4}, {2, 3, 3, 4}};
        System.out.println(perfectRectangle.isRectangleCover(rectangles));
    }

    public boolean isRectangleCover(int[][] rectangles) {
        if (rectangles == null) {
            return false;
        }
        int minX = Integer.MAX_VALUE;
        int minY = minX;
        int maxX = -minY;
        int maxY = maxX;
        Set<String> finalPoints = new HashSet<>();
        int area = 0;

        for (int[] rectangle : rectangles) {
            minX = Math.min(minX, rectangle[0]);
            minY = Math.min(minY, rectangle[1]);
            maxX = Math.max(maxX, rectangle[2]);
            maxY = Math.max(maxY, rectangle[3]);

            area += getArea(rectangle);

            String x1 = rectangle[0] + ":" + rectangle[1];
            if (!finalPoints.add(x1)) {
                finalPoints.remove(x1);
            }
            String x2 = rectangle[0] + ":" + rectangle[3];
            if (!finalPoints.add(x2)) {
                finalPoints.remove(x2);
            }

            String y1 = rectangle[2] + ":" + rectangle[3];
            if (!finalPoints.add(y1)) {
                finalPoints.remove(y1);
            }
            String y2 = rectangle[2] + ":" + rectangle[1];
            if (!finalPoints.add(y2)) {
                finalPoints.remove(y2);
            }
        }
        System.out.println(finalPoints);
        if (finalPoints.size() != 4 || !finalPoints.contains(minX + ":" + minY) || !finalPoints.contains(maxX + ":" + minY) || !finalPoints.contains(minX + ":" + maxY) || !finalPoints.contains(maxX + ":" + maxY)) {
            return false;
        }
        return getArea(new int[]{minX, minY, maxX, maxY}) == area;
    }

    private int getArea(int[] rectangle) {
        return (rectangle[2] - rectangle[0]) * (rectangle[3] - rectangle[1]);
    }

}
