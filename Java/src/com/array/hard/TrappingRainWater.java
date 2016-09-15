package com.array.hard;

/**
 * Created by krutarthjoshi on 9/12/16.
 * LeetCode 42 - Trapping Rain Water
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 * For example,
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */
public class TrappingRainWater {

    public static void main(String[] args) {
        TrappingRainWater trw = new TrappingRainWater();
        int[] input = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trw.trap(input));
    }

    private int trap(int[] height) {
        if (height == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        if (height.length < 3) {
            return 0;
        }
        int water = 0;
        int lo = 0;
        int hi = height.length - 1;
        int maxLeft = height[lo];
        int maxRight = height[hi];
        while (lo <= hi) {
            if (maxLeft <= maxRight) {
                if (height[lo] >= maxLeft) {
                    maxLeft = height[lo];
                } else {
                    water += maxLeft - height[lo];
                }
                lo++;
            } else {
                if (height[hi] >= maxRight) {
                    maxRight = height[hi];
                } else {
                    water += maxRight - height[hi];
                }
                hi--;
            }
        }
        return water;
    }
}
