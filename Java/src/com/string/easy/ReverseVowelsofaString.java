package com.string.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by krutarthjoshi on 11/12/16.
 */
public class ReverseVowelsofaString {

    public static void main(String[] args) {
        ReverseVowelsofaString reverseVowelsofaString = new ReverseVowelsofaString();
        String s = "leetcode";
        System.out.println(reverseVowelsofaString.reverseVowels(s));
    }

    public String reverseVowels(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int l = s.length();
        int lo = 0;
        int hi = l - 1;

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        StringBuilder sb = new StringBuilder(s);

        while (lo <= hi) {
            if (vowels.contains(sb.charAt(lo))) {
                if (vowels.contains(sb.charAt(hi))) {
                    swap(sb, lo, hi);
                    lo++;
                    hi--;
                } else {
                    hi--;
                }
            } else {
                lo++;
            }
        }
        return sb.toString();
    }

    private void swap(StringBuilder sb, int lo, int hi) {
        char temp = sb.charAt(lo);
        sb.setCharAt(lo, sb.charAt(hi));
        sb.setCharAt(hi, temp);
    }

}
