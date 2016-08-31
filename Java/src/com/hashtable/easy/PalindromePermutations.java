package com.hashtable.easy;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 8/29/16.
 */
public class PalindromePermutations {

    public static void main(String[] args) {
        PalindromePermutations pp = new PalindromePermutations();
        System.out.println(pp.canPalindromePermute("code"));
    }

    private boolean canPalindromePermute(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int l = chars.length;
        System.out.println(Arrays.toString(chars));
        int count = 1;
        boolean flag = false;
        int i = 0;
        while (true) {
            if (chars[i] != chars[i + 1]) {
                if (count % 2 != 0) {
                    if (flag) {
                        return false;
                    } else {
                        flag = true;
                    }
                }
                count = 1;
            } else {
                count++;
            }
            i++;
            if (i == l - 1) break;
        }
        if (count % 2 != 0) {
            if (flag) {
                return false;
            }
        }
        return true;
    }
}
