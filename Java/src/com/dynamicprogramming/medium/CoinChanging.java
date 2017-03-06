package com.dynamicprogramming.medium;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 2/20/17.
 * Generate the number of ways that we can generate the total
 * given infinite number of each type of coins
 */
public class CoinChanging {

    private int numWaysCoinChange(int[] coins, int amount) {
        if (coins == null || amount == 0) {
            return 0;
        }
        int l = coins.length;
        if (l == 0) {
            return 0;
        }
        int[][] dp = new int[l][amount + 1];
        Arrays.fill(dp[0], 1);
        for (int i = 1; i < l; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < l; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j < coins[i]) {
                    dp[i][j] = dp[i][j - 1];
                } else if (j == coins[i]) {
                    dp[i][j] = dp[i - 1][j] + 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i]];
                }
            }
        }
        return dp[l - 1][amount];
    }


    public static void main(String[] args) {
        CoinChanging cc = new CoinChanging();
        int[] input = {1, 2};
        System.out.println(cc.numWaysCoinChange(input, 4));
    }
}
