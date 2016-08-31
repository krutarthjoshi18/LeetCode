package com.math.easy;

/**
 * Created by krutarthjoshi on 7/26/16.
 * LeetCode 9 - Palindrom Number
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        System.out.println(pn.isPalindrome(543345));
    }

    private boolean isPalindrome(int input) {
        if (input < 0 || (input != 0 && input % 10 == 0)) return false;
        int reverse = 0;
        while (input > reverse) {
            reverse = reverse * 10 + input % 10;
            input /= 10;
        }
        return reverse == input || reverse / 10 == input;
    }
}
