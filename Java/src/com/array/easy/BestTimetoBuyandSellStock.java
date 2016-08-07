package com.array.easy;

/**
 * Created by krutarthjoshi on 6/17/16.
 * LeetCode 121 - Best Time to Buy and Sell Stock
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 */
public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {
        BestTimetoBuyandSellStock bstbass = new BestTimetoBuyandSellStock();
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(bstbass.maximumProfit(input));
    }

    private int maximumProfit(int[] A) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            int currPrice = A[i];
            minPrice = Math.min(minPrice, currPrice);
            maxProfit = Math.max(maxProfit, currPrice - minPrice);
        }
        return maxProfit;
    }
}
