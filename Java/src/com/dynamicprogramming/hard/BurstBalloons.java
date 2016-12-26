package com.dynamicprogramming.hard;

import com.dynamicprogramming.easy.PaintFence;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by krutarthjoshi on 11/26/16.
 * LeetCode 312 - Burst Balloons
 * Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums. You are asked to burst all the balloons. If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins. Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.
 * Find the maximum coins you can collect by bursting the balloons wisely.
 * Note:
 * (1) You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
 * (2) 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
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
        if (nums == null) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int l = nums.length;
        if (l == 0) {
            return 0;
        }
        List<Integer> input = new ArrayList<>();
        input.add(-1);
        for (int num : nums) {
            input.add(num);
        }
        input.add(-1);
        Arrays.sort(nums);
        int index = 0;
        int product = 0;
        while (!(input.size() < 3)) {
            if (input.size() == 3) {
                product += input.get(1);
                input.remove(1);
            } else if (input.size() == 4) {
                product += Math.abs(input.get(1) * input.get(2));
                boolean isIndexOne = input.get(1) < input.get(2);
                if (isIndexOne) {
                    input.remove(1);
                } else {
                    input.remove(2);
                }
            } else {
                int curr = input.indexOf(nums[index]);
                if (curr == 1 || curr == input.size() - 2) {
                    index++;
                    continue;
                }
                int currProd = Math.abs(input.get(curr - 1) * input.get(curr) * input.get(curr + 1));
                product += currProd;
                input.remove(curr);
                index++;
            }
        }
        return product;
    }
}
