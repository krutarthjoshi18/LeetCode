package com.hashtable.easy;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 7/29/16.
 */
public class IsomorphicStrings {

    public static void main(String[] args) {
        IsomorphicStrings is = new IsomorphicStrings();
        System.out.println(is.isIso("ab", "aa"));
    }

    private boolean isIso(String s, String t) {
        int[] charDiff = new int[256];
        boolean[] setValue = new boolean[256];
        int garbage = Integer.MAX_VALUE;
        Arrays.fill(charDiff, garbage);
        if (s == null || t == null) {
            return false;
        }
        int ls = s.length();
        int lt = t.length();
        if (ls != lt) {
            return false;
        }
        if (ls == 1) {
            return true;
        }
        for (int i = 0; i < ls; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (charDiff[sChar] == garbage) {
                if (setValue[tChar]) {
                    return false;
                }
                charDiff[sChar] = tChar - sChar;
                setValue[tChar] = true;
            } else {
                if (charDiff[sChar] != tChar - sChar) {
                    return false;
                }
            }
        }
        return true;
    }
}
