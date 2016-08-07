package com.math.medium;

/**
 * Created by krutarthjoshi on 7/27/16.
 * LeetCode 357 - Count Numbers with Unique Digits
 * Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.
 * Example:
 * Given n = 2, return 91. (The answer should be the total numbers in the range of 0 ≤ x < 100,
 * excluding [11,22,33,44,55,66,77,88,99])
 */
public class CountNumberswithUniqueDigits {

    public static void main(String[] args) {
        CountNumberswithUniqueDigits cnwud = new CountNumberswithUniqueDigits();
        System.out.println(cnwud.countNumbersWithUniqueDigits(4));
    }

    private int countNumbersWithUniqueDigits(int n) {
        int result = 1;
        if (n >= 1) {
            result += 9;
        }
        if (n >= 2) {
            result += 81;
        }
        int product = 81;
        int count = 9;
        for (int i = 3; i <= n; i++) {
            product *= --count;
            result += product;
        }
        return result;
    }
}
