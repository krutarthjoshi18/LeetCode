package com.math.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by krutarthjoshi on 11/28/16.
 */
public class LineReflection {

    public static void main(String[] args) {
        LineReflection lr = new LineReflection();
        int[][] points = {{1, 1}, {-1, -1}};
        System.out.println(lr.isReflected(points));
    }

    public boolean isReflected(int[][] points) {
        if (points == null || points.length == 0) {
            return true;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Set<String> set = new HashSet<>();
        for (int[] point : points) {
            max = Math.max(max, point[0]);
            min = Math.min(min, point[0]);
            set.add(point[0] + ":" + point[1]);
        }
        int sum = max + min;
        for (int[] point : points) {
            if (!set.contains((sum - point[0]) + ":" + point[1])) {
                return false;
            }
        }
        return true;
    }
}
