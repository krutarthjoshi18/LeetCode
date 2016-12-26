package com.dynamicprogramming.easy;

/**
 * Created by krutarthjoshi on 11/12/16.
 * LeetCode 276 - Paint Fence
 * There is a fence with n posts, each post can be painted with one of the k colors.
 * You have to paint all the posts such that no more than two adjacent fence posts have the same color.
 * Return the total number of ways you can paint the fence.
 * Note:
 * n and k are non-negative integers.
 */
public class PaintFence {

    public static void main(String[] args) {
        PaintFence paintFence = new PaintFence();
        System.out.println(paintFence.numWaystoPaint(7, 6));
    }

    private int numWaystoPaint(int n, int k) {
        if (n < 0 || k < 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        if (n == 0 || k == 0) {
            return 0;
        }
        if (n == 1) {
            return k;
        }
        int diffColors = k * (k - 1);
        int sameColors = k;
        for (int i = 2; i < n; i++) {
            int temp = diffColors;
            diffColors += sameColors;
            diffColors *= (k - 1);
            sameColors = temp;
        }
        return diffColors + sameColors;
    }
}
