package com.math.easy;

/**
 * Created by krutarthjoshi on 7/26/16.
 * LeetCode 258 - Add Digits
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */
public class AddDigits {

    public static void main(String[] args) {
        AddDigits ad = new AddDigits();
        System.out.println(ad.generateDigitRoot(729));
    }

    private int generateDigitRoot(int in) {
        return in - (in - 1) / 9 * 9;
    }
}
