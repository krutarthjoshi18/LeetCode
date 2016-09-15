package com.string.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Pack200;

/**
 * Created by krutarthjoshi on 9/12/16.
 * LeetCode 49 - Group Anagrams
 * Given an array of strings, group anagrams together.
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Return:
 * [
 * ["ate", "eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * Note: All inputs will be in lower-case.
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(ga.groupAnagrams(input));
    }

    private List<List<String>> groupAnagrams(String[] strs) {
        int l = strs.length;
        if (l == 0) {
            throw new IllegalArgumentException("Illegal Argument");
        }
        boolean[] isChecked = new boolean[l];
        List<List<String>> anagrams = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            List<String> anagramSet = new ArrayList<>();
            if (isChecked[i]) {
                continue;
            } else {
                anagramSet.add(strs[i]);
                for (int j = i + 1; j < l; j++) {
                    if (isChecked[j]) {
                        continue;
                    } else {
                        if (isValidAnagram(strs[i], strs[j])) {
                            isChecked[j] = true;
                            anagramSet.add(strs[j]);
                        }
                    }
                }
                isChecked[i] = true;
            }
            anagrams.add(anagramSet);
        }
        return anagrams;
    }

    private boolean isValidAnagram(String s, String t) {
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
