package com.string.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by krutarthjoshi on 8/12/16.
 */
public class LongestSubstringwithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringwithoutRepeatingCharacters lswrc = new LongestSubstringwithoutRepeatingCharacters();
        System.out.println(lswrc.lengthOfLongestSubstring("pwwkew"));
    }

    private int getLength(String s) {
        Set<Character> noRepeat = new HashSet<>();
        int count = 0;
        int max = count;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (!noRepeat.add(curr)) {
                count = 0;
                noRepeat.clear();
            } else {
                count++;
                noRepeat.add(curr);
            }
            max = Math.max(max, count);
        }
        return max;
    }

    private int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        int l = s.length();
        if (l == 0) {
            return 0;
        }
        int i = 0, j = 0, maxLength = 0;
        int[] index = new int[26];
        while (i < l) {
            char curr = s.charAt(i);
            int loc = curr - 'a';
            j = Math.max(j, index[loc]);
            maxLength = Math.max(maxLength, i - j + 1);
            index[loc] = ++i;
        }
        return maxLength;
    }
}
