package com.string.easy;

/**
 * Created by krutarthjoshi on 11/26/16.
 */
public class RepeatedSubstringPattern {

    public static void main(String[] args) {
        RepeatedSubstringPattern pattern = new RepeatedSubstringPattern();
        System.out.println(pattern.isSubstringRepeated("acbacbacb"));
    }

    private boolean isSubstringRepeated(String s) {
        int l = s.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                int m = l / i;
                String subS = s.substring(0, i);
                int j;
                for (j = 1; j < m; j++) {
                    if (!subS.equals(s.substring(j * i, i + j * i))) {
                        return false;
                    }
                }
                if (j == m)
                    return true;
            }
        }
        return false;
    }
}