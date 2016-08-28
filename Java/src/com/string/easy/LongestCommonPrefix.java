package com.string.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by krutarthjoshi on 7/20/16.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(new String[]{"", "ab", "abcde", "abcd"}));
    }

    private String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        return calculatePrefix(strs);
    }

    private String calculatePrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        char[] strs0 = strs[0].toCharArray();
        char[] strsN = strs[strs.length - 1].toCharArray();
        for (int i = 0; i < strs0.length; i++) {
            if (strs0[i] == strsN[i]) {
                sb.append(strs0[i]);
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
