package com.bitmanipulation.medium;

/**
 * Created by krutarthjoshi on 2/25/17.
 * LeetCode 318 - Maximum Product of Word Lengths
 * Given a string array words,
 * find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters.
 * You may assume that each word will contain only lower case letters. If no such two words exist, return 0.
 * Example 1:
 * Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
 * Return 16
 * The two words can be "abcw", "xtfn".
 * Example 2:
 * Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
 * Return 4
 * The two words can be "ab", "cd".
 * Example 3:
 * Given ["a", "aa", "aaa", "aaaa"]
 * Return 0
 * No such pair of words.
 */
public class MaximumProductsofWordLengths {

    public int maxProduct(String[] words) {
        if (words == null) {
            return 0;
        }
        int l = words.length;
        if (l == 0) {
            return 0;
        }
        int[] binaryString = new int[l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                binaryString[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }
        int maxProduct = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if ((binaryString[i] & binaryString[j]) == 0) {
                    maxProduct = Math.max(maxProduct, words[i].length() * words[j].length());
                }
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        MaximumProductsofWordLengths mpowl = new MaximumProductsofWordLengths();
        System.out.println(mpowl.maxProduct(new String[]{"abc", "ba", "foo", "bac", "abcdf"}));
    }
}
