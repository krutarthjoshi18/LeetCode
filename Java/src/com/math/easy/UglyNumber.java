package com.math.easy;

/**
 * Created by krutarthjoshi on 7/27/16.
 * LeetCode 263 - Ugly Number
 * Write a program to check whether a given number is an ugly number.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
 * Note that 1 is typically treated as an ugly number.
 */
public class UglyNumber {

    public static void main(String[] args) {
        UglyNumber un = new UglyNumber();
        System.out.println(un.isUgly(54));
    }

    private boolean isUgly(int n) {
        if (n > 0) {
            for (int i = 5; i > 1; i--) {
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        return n == 1;
    }
}
