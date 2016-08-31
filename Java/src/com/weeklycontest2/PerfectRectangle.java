package com.weeklycontest2;

import java.util.BitSet;

/**
 * Created by krutarthjoshi on 8/27/16.
 */
public class PerfectRectangle {

    public static void main(String[] args) {
        int[][] rectangles = new int[4][4];
        System.out.println(isRectangleCover(rectangles));
    }

    private static boolean isRectangleCover(int[][] rectangles) {
        BitSet isPerfectRectangeX = new BitSet();
        BitSet isPerfectRectangeY = new BitSet();
        for (int i = 0; i < rectangles.length; i++) {
            if (overLapOccrs(rectangles, i, isPerfectRectangeX, isPerfectRectangeY)) {
                return false;
            } else {
                isPerfectRectangeX.set(rectangles[i][0], rectangles[i][2]);
                isPerfectRectangeY.set(rectangles[i][1], rectangles[i][3]);
            }
        }
        return true;
    }

    private static boolean overLapOccrs(int[][] rec, int i, BitSet x, BitSet y) {
        return false;
    }
}
