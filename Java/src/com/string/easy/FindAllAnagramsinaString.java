package com.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by krutarthjoshi on 11/26/16.
 * LeetCode 438 - Find all anagrams in a String
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 * The order of output does not matter.
 * Example 1:
 * Input:
 * s: "cbaebabacd" p: "abc"
 * Output:
 * [0, 6]
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * Example 2:
 * Input:
 * s: "abab" p: "ab"
 * Output:
 * [0, 1, 2]
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 */
public class FindAllAnagramsinaString {

    public static void main(String[] args) {
        FindAllAnagramsinaString string = new FindAllAnagramsinaString();
        System.out.println(string.findAnagrams("abab", "ab"));
    }

    private List<Integer> findAnagrams(String s, String p) {
        if (s == null || p == null) {
            throw new IllegalArgumentException("Invalid Input");
        }

        List<Integer> result = new ArrayList<>();
        int m = s.length();
        int n = p.length();
        char[] P = p.toCharArray();

        Arrays.sort(P);
        p = Arrays.toString(P);
        for (int i = 0; i < m - n + 1; i++) {
            char[] S = s.substring(i, i + n).toCharArray();
            Arrays.sort(S);
            String temp = Arrays.toString(S);
            S = null;
            if (p.equals(temp)) {
                result.add(i);
            }
            temp = null;
        }
        return result;
    }
}
