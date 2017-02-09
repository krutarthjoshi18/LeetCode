package com.string.medium;

/**
 * Created by krutarthjoshi on 9/29/16.
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindrome("amamam"));
    }

    private String longestPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int l = s.length();
        if (l == 0) {
            return "";
        }
        int start = 0, stop = 0;
        for (int i = 0; i < l; i++) {
            int oddLength = expandAroundCenter(s, i - 1, i + 1);
            int evenLength = expandAroundCenter(s, i, i + 1);
            int len = Math.max(oddLength, evenLength);
            if (len > stop - start) {
                start = i - (len - 1) / 2;
                stop = i + len / 2;
            }
        }
        return s.substring(start, stop + 1);
    }

    private int expandAroundCenter(String s, int start, int stop) {
        int i = start, j = stop;
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }
}
