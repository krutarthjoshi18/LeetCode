package com.hashtable.easy;

import java.util.HashMap;

/**
 * Created by krutarthjoshi on 8/13/16.
 * LeetCode 242 - Valid Anagram
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram {

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isValidAnagram("eat", "tan"));
    }

    private boolean isValidAnagram(String s, String t) {
        HashMap<Integer, Character> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        int l = s.length();
        char[] count = new char[26];
        for (int i = 0; i < l; i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
