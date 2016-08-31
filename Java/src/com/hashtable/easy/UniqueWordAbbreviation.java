package com.hashtable.easy;

import java.util.*;

/**
 * Created by krutarthjoshi on 8/29/16.
 * An abbreviation of a word follows the form <first letter><number><last letter>. Below are some examples of word abbreviations:
 * a) it                      --> it    (no abbreviation)
 * 1
 * b) d|o|g                   --> d1g
 * 1    1  1
 * 1---5----0----5--8
 * c) i|nternationalizatio|n  --> i18n
 * 1
 * 1---5----0
 * d) l|ocalizatio|n          --> l10n
 * Assume you have a dictionary and given a word, find whether its abbreviation is unique in the dictionary.
 * A word's abbreviation is unique if no other word from the dictionary has the same abbreviation.
 * Example:
 * Given dictionary = [ "deer", "door", "cake", "card" ]
 * isUnique("dear") -> false
 * isUnique("cart") -> true
 * isUnique("cane") -> false
 * isUnique("make") -> true
 */
public class UniqueWordAbbreviation {

    private HashMap<String, HashSet<String>> abbHashTable = new HashMap<>();

    public UniqueWordAbbreviation(String[] dictionary) {
        for (String s : dictionary) {
            String abb = generateAbb(s);
            if (!abbHashTable.containsKey(abb)) {
                abbHashTable.put(abb, new HashSet<>());
            }
            abbHashTable.get(abb).add(s);

        }
    }

    public static void main(String[] args) {
        String[] dictionary = {"a", "a"};
        UniqueWordAbbreviation uwa = new UniqueWordAbbreviation(dictionary);
        System.out.println(uwa.isUnique("a"));
        System.out.println(uwa.generateAbb("ab"));
    }

    private boolean isUnique(String word) {
        String abb = generateAbb(word);
        if (abbHashTable.containsKey(abb)) {
            if (abbHashTable.get(abb).size() > 1) {
                return false;
            }
            if (!abbHashTable.get(abb).contains(word)) {
                return false;
            }
        }
        return true;
    }

    private String generateAbb(String s) {
        if (s == null) {
            return "";
        }
        int l = s.length();
        if (l == 0) {
            return "";
        }
        if (l <= 2) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(l - 2);
        sb.append(s.charAt(l - 1));
        return sb.toString();
    }
}