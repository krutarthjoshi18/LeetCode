package com.string.easy;

/**
 * Created by krutarthjoshi on 9/19/16.
 * LeetCode 387 - irst Unique Character in a String
 */

public class FirstUniqueCharacterinaString {

    public static void main(String[] args) {
        FirstUniqueCharacterinaString fucias = new FirstUniqueCharacterinaString();
        String s1 = "leetcode";
        System.out.println(fucias.firstUniqChar(s1));
        String s2 = "loveleetcode";
        System.out.println(fucias.firstUniqChar(s2));
    }

    private int firstUniqChar(String s) {
        int[] indexArray = new int[26];
        int l = s.length();
        int result = l - 1;
        for (int i = 0; i < l; i++) {
            indexArray[s.charAt(i) - 'a']++;
        }
        //System.out.println(Arrays.toString(indexArray));
        for (int i = 0; i < 26; i++) {
            int index = indexArray[i];
            if (index == 1) {
                result = Math.min(s.indexOf(i + 'a'), result);
            }
        }
        return result;
    }
}
