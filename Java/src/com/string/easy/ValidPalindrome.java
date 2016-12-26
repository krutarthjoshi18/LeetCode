package com.string.easy;

/**
 * Created by krutarthjoshi on 9/25/16.
 * LeetCode 135 - Valid Palindrome
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isValidPalindrome("0P"));
        char t = '9';
        System.out.println(t - '1' > 5);
    }

    private boolean isValidPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int l = s.length();
        if (l == 0) {
            return true;
        }
        int lo = 0;
        int hi = l - 1;
        while (lo <= hi) {
            char loChar = s.charAt(lo);
            char hiChar = s.charAt(hi);
            if (Character.isLetterOrDigit(loChar)) {
                if (Character.isLetterOrDigit(hiChar)) {
                    if (Character.toLowerCase(loChar) == Character.toLowerCase(hiChar)) {
                        lo++;
                        hi--;
                    } else {
                        return false;
                    }
                } else {
                    hi--;
                }
            } else {
                lo++;
            }
        }
        return true;
    }
}
