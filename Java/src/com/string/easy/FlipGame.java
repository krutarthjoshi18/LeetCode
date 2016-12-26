package com.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krutarthjoshi on 11/12/16.
 */
public class FlipGame {

    public static void main(String[] args) {
        FlipGame flipGame = new FlipGame();
        System.out.println(flipGame.flipGame("++++"));
        String s = "leetcode";
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(0, 'a');
    }

    private List<String> flipGame(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int l = s.length();
        if (l < 0) {
            return new ArrayList<String>() {
            };
        }
        List<String> result = new ArrayList<>();
        for (int i = 1; i < l; i++) {
            if (s.charAt(i - 1) == '+' && s.charAt(i) == '+') {
                result.add(s.substring(0, i - 1) + "--" + s.substring(i + 1));
            }
        }
        return result;
    }
}
