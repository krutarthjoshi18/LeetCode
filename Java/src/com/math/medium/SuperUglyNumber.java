package com.math.medium;

/**
 * Created by krutarthjoshi on 7/29/16.
 * LeetCode 313 - Super Ugly Number
 * Write a program to find the nth super ugly number.
 * Super ugly numbers are positive numbers whose all prime factors are in the given prime list primes of size k.
 * For example, [1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32] is the sequence of the first 12 super ugly numbers
 * given primes = [2, 7, 13, 19] of size 4.
 */
public class SuperUglyNumber {

    public static void main(String[] args) {
        SuperUglyNumber sun = new SuperUglyNumber();
        System.out.println(sun.nthSuperUglyNumber(100000, new int[]{7, 19, 29, 37, 41, 47, 53, 59, 61, 79, 83, 89, 101, 103, 109, 127, 131, 137, 139, 157, 167, 179, 181, 199, 211, 229, 233, 239, 241, 251}));
    }


    private int nthSuperUglyNumber(int n, int[] primes) {
        int count = 0;
        int curr = 1;
        while (count < n) {
            if (isSuperUgly(curr, primes)) {
                count++;
            }
            curr++;
        }
        return curr - 1;
    }

    private boolean isSuperUgly(int n, int[] primes) {
        if (n == 1) {
            return true;
        }
        for (int i = 0; i < primes.length; i++) {
            while (n % primes[i] == 0) {
                n /= primes[i];
            }
            if (n == 1) return true;
        }
        return n == 1;
    }
}
