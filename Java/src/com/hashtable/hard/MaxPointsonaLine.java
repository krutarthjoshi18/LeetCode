package com.hashtable.hard;

import java.util.Random;

/**
 * Created by krutarthjoshi on 10/6/16.
 */
public class MaxPointsonaLine {

    public static void main(String[] args) {
        MaxPointsonaLine mpoal = new MaxPointsonaLine();
        Point[] input = mpoal.generateRandomPoints(25);
        System.out.println(mpoal.maxPoints(input));
    }

    private Point[] generateRandomPoints(int n) {
        Random randomGenerator = new Random();
        Point[] pointArray = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = randomGenerator.nextInt(100);
            int y = randomGenerator.nextInt(100);
            Point point = new Point(x, y);
            pointArray[i] = point;
        }
        return pointArray;
    }

    private int maxPoints(Point[] points) {
        for (Point p : points) {
            System.out.println(p.x + ", " + p.y);
        }
        return 0;
    }
}
