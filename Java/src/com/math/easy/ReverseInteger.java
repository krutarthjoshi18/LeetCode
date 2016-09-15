package com.math.easy;

/**
 * Created by krutarthjoshi on 9/3/16.
 * LeetCode 7 - Reverse Integer
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reversedInteger(8));
    }

    private int reversedInteger(int x) {
        if (x == 0) {
            return 0;
        }
        if (x / 10 == 0) {
            return x;
        }
        boolean isNegative = x < 0;
        x = isNegative ? -x : x;
        long rev = 0;
        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        int revr = rev > Integer.MAX_VALUE ? 0 : (int) rev;
        return isNegative ? -revr : revr;
    }
}
