package com.dynamicprogramming.medium;

/**
 * Created by krutarthjoshi on 2/20/17.
 * LeetCode 322 - Coin Change
 * You are given coins of different denominations and a total amount of money amount.
 * Write a function to compute the fewest number of coins that you need to make up that amount.
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 * Example 1:
 * coins = [1, 2, 5], amount = 11
 * return 3 (11 = 5 + 5 + 1)
 * Example 2:
 * coins = [2], amount = 3
 * return -1.
 * Note:
 * You may assume that you have an infinite number of each kind of coin.
 */
public class CoinChangeMinWays {

    private int minWays(int[] coins, int amount) {
        if (coins == null || amount == 0) {
            return 0;
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
