package com.string.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
            throw new IllegalArgumentException("Invalid Input");
        }

        int l = digits.length();
        if (l == 0) {
            return new LinkedList<String>() {
            };
        }

        String[] letters = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        result.add("");

        for (int i = 0; i < l; i++) {
            while (result.get(0).length() == i) {
                String t = result.remove(0);
                for (int j = 0; j < letters[digits.charAt(i) - '0'].length(); j++) {
                    result.add(t + letters[digits.charAt(i) - '0'].charAt(j));
                }
            }
        }
        return result;
    }
}
