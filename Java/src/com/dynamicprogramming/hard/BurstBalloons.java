package com.dynamicprogramming.hard;

/**
 * Created by krutarthjoshi on 11/26/16.
 * LeetCode 312 - Burst Balloons
 * Given n balloons, indexed from 0 to n-1.
 * Each balloon is painted with a number on it represented by array nums.
 * You are asked to burst all the balloons.
 * If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins.
 * Here left and right are adjacent indices of i.
 * After the burst, the left and right then becomes adjacent.
 * Find the maximum coins you can collect by bursting the balloons wisely.
 *
 * Note:
 * (1) You may imagine nums[-1] = nums[n] = 1.
 * They are not real therefore you can not burst them.
 *
 * (2) 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
 *
 * Example:
 * Given [3, 1, 5, 8]
 * Return 167
 * nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
 * coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
 */
public class BurstBalloons {

    public static void main(String[] args) {
        BurstBalloons balloons = new BurstBalloons();
        int[] input = {3, 1, 5, 8};
        System.out.println(balloons.maxCoins(input));
    }

    private int maxCoins(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = nums.length;
        int product = 1;
        return product;
    }
}
