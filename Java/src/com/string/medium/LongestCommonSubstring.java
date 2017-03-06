package com.string.medium;

/**
 * Created by krutarthjoshi on 2/20/17.
 */
public class LongestCommonSubstring {

    private int longestCommonSubstring(String s, String t) {
        if (s == null || t == null) {
            return 0;
        }
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m][n];
        int maxLength = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;

                    }
                    maxLength = Math.max(maxLength, dp[i][j]);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestCommonSubstring lcs = new LongestCommonSubstring();
        System.out.println(lcs.longestCommonSubstring("cde", "abcdf"));
    }
}
