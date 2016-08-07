package com.math.medium;

/**
 * Created by krutarthjoshi on 7/27/16.
 * LeetCode 343 - Integer Break
 * Given a positive integer n, break it into the sum of at least two positive integers and
 * maximize the product of those integers. Return the maximum product you can get.
 * For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).
 * Note: You may assume that n is not less than 2 and not larger than 58.
 */
public class IntegerBreak {

    public static void main(String[] args) {
        IntegerBreak ib = new IntegerBreak();
        System.out.println(ib.integerBreak(4));
    }

    private int integerBreak (int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        int quo = n / 3;
        int rem = n % 3;
        if (rem == 0) {
            return (int) Math.pow(3, quo);
        }
        if (rem == 1) {
            return (int) Math.pow(3, quo - 1) * 4;
        }
        if (rem == 2) {
            return (int) Math.pow(3, quo) * 2;
        }
        return 0;
    }
}
