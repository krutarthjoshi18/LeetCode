package com.string.hard;

/**
 * Created by krutarthjoshi on 8/31/16.
 * LeetCode 214 - Shortest Palindrome
 * Given a string S, you are allowed to convert it to a palindrome by adding characters in front of it.
 * Find and return the shortest palindrome you can find by performing this transformation.
 * For example:
 * Given "aacecaaa", return "aaacecaaa".
 * Given "abcd", return "dcbabcd".
 */
public class ShortestPalindrome {

    public static void main(String[] args) {
        ShortestPalindrome sp = new ShortestPalindrome();
        String s = "shdashkdhasjhdlashaskjdhashdkjhasldhkjashdljhasdljaslkdhlhgwqoueyasjdbkasbdlkshclzxhlchasldashjdlkasjlkdjaslkjdlkasjdlkjaslkdjlaksjdashkaghjkfhaljdlasjdlkasjkldjaslkfgkjashflkasjldhasldjlkasjdlkasjdlkasdbca";
        long st = System.nanoTime();
        System.out.println(sp.shortestPalindrome(s));
        System.out.println(System.nanoTime() - st);
        st = System.nanoTime();
        System.out.println(sp.kmp(s));
        System.out.println(System.nanoTime() - st);
    }

    private String kmp(String s) {

        String temp = s + "#" + new StringBuilder(s).reverse().toString();
        int[] table = getTable(temp);
        return new StringBuilder(s.substring(table[table.length - 1])).reverse().toString() + s;
    }

    public int[] getTable(String s) {

        int[] table = new int[s.length()];
        int index = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(index) == s.charAt(i)) {
                table[i] = table[i - 1] + 1;
                index++;
            } else {
                index = table[i - 1];
                while (index > 0 && s.charAt(index) != s.charAt(i)) {
                    index = table[index - 1];
                }
                if (s.charAt(index) == s.charAt(i)) {
                    index++;
                }
                table[i] = index;
            }
        }
        return table;
    }

    private String shortestPalindrome(String s) {
        if (s == null) {
            return "";
        }
        int l = s.length();
        if (l == 0) {
            return "";
        }
        int center = l / 2;
        int iteration = 0;
        boolean flag = l % 2 == 0;
        while (center > 0) {
            if (flag) {
                if (!expandAroundCenter(s, center - 1, center)) {
                    center--;
                    flag = false;
                } else {
                    return iteration == 0 ? s : reverse(s.substring(2 * center, l)) + s;
                }
            } else {
                if (!expandAroundCenter(s, center)) {
                    flag = true;
                } else {
                    return iteration == 0 ? s : reverse(s.substring(2 * center + 1, l)) + s;
                }
            }
            iteration++;
        }
        return reverse(s.substring(1, l)) + s;
    }

    private boolean expandAroundCenter(String s, int center) {
        int lo = center;
        int hi = lo;
        return expand(s, lo, hi);
    }

    private boolean expandAroundCenter(String s, int i, int j) {
        int lo = i;
        int hi = j;
        return expand(s, lo, hi);
    }

    private boolean expand(String s, int lo, int hi) {
        while (lo >= 0) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return false;
            }
            lo--;
            hi++;
        }
        return true;
    }

    private String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        int l = s.length();
        for (int i = 0; i < l; i++) {
            sb.append(s.charAt(l - i - 1));
        }
        return sb.toString();
    }
}
