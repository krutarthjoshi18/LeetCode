package com.string.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by krutarthjoshi on 11/29/16.
 * LeetCode 17 - Letter Combinations of a Phone number
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note:
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 */
public class LetterCombinationsofPhoneNumber {

    public static void main(String[] args) {
        LetterCombinationsofPhoneNumber number = new LetterCombinationsofPhoneNumber();
        System.out.println(number.letterCombinations("23"));
    }

    private List<String> letterCombinations(String digits) {
        if (digits == null) {
            return null;
        }
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new LinkedList<>();
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            while (result.get(0).length() == i) {
                String s = result.remove(0);
                for (char c : mapping[digits.charAt(i) - '0'].toCharArray()) {
                    result.add(s + c);
                }
            }
        }
        return result;
    }
}
