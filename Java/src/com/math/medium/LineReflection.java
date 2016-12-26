package com.math.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by krutarthjoshi on 11/28/16.
 */
public class LineReflection {

    class Point {

        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        LineReflection lr = new LineReflection();
        int[][] points = {{-1, 1}, {1, 1}, {16, 1}, {-16, 1}, {16, 1}, {-1, 1}};
        System.out.println(lr.isReflected(points));
    }

    private boolean isReflected(int[][] points) {
        if (points == null) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int l = points.length;
        if (l == 0) {
            return true;
        }

        Set<Point> pointSet = new HashSet<>();

        for (int i = 0; i < l; i++) {
            Point point = new Point(points[i][0], points[i][1]);
            if (pointSet.contains(point)) {
                continue;
            }
            pointSet.add(point);
        }

        int center = 0;
        int x = points[0][1];

        for (Point point : pointSet) {
            System.out.println(point.x + "," + point.y);
        }

        return false;
    }
}
