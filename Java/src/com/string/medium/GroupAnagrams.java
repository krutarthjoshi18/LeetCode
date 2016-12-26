package com.string.medium;

import java.util.*;
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
        if (strs == null) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int l = strs.length;
        List<List<String>> list = new ArrayList<>();
        if (l == 0) {
            return list;
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String s = String.valueOf(temp);
            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
