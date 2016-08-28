package com.string.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by krutarthjoshi on 8/12/16.
 */
public class LongestSubstringwithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringwithoutRepeatingCharacters lswrc = new LongestSubstringwithoutRepeatingCharacters();
        System.out.println(lswrc.getLength("pwwkew"));
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
}
