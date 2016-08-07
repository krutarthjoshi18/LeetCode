package com.string.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by krutarthjoshi on 7/20/16.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(new String[]{"abc", "ab", "arip", "abcd"}));
        System.out.println(lcp.longestCommonPrefixSorted(new String[]{"abc", "ab", "rip", "abcd"}));
    }

    private String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String lcp_final = strs[0];
        for (int i = 0; i < strs.length - 1; i++) {
            String lcp_temp = longestCommonPrefix(strs[i], strs[i + 1]);
            //System.out.println(lcp_temp);
            lcp_final = longestCommonPrefix(lcp_final, lcp_temp);
        }
        return lcp_final;
    }

    private String longestCommonPrefix(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int l = a.length() > b.length() ? b.length() : a.length();
        for (int i = 0; i < l; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                sb.append(a.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }

    private String longestCommonPrefixSorted(String[] strs) {
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        System.out.println(Arrays.toString(strs));
        return "";
    }
}
