package com.string.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krutarthjoshi on 11/29/16.
 */
public class GenerateParenthesis {

    public static void main(String[] args) {
        GenerateParenthesis parenthesis = new GenerateParenthesis();
        System.out.println(parenthesis.generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, String str, int open, int close, int max) {

        if (str.length() == max * 2) {
            list.add(str);
            return;
        }
        if (open < max)
            backtrack(list, str + "(", open + 1, close, max);
        if (close < open)
            backtrack(list, str + ")", open, close + 1, max);
    }
}
