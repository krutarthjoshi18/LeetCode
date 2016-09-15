package com.stack.easy;

import java.util.Stack;

/**
 * Created by krutarthjoshi on 9/3/16.
 * LeetCode 20 - Valid Parentheses
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * The brackets must close in the correct order,
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("()[}{}"));
    }

    private boolean isValid(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int l = s.length();
        if (l == 0) {
            return true;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < l; i++) {
            int currChar = s.charAt(i);
            if (!stack.isEmpty() && (currChar - stack.peek() == 1 || currChar - stack.peek() == 2)) {
                stack.pop();
            } else {
                stack.push(currChar);
            }
        }
        return stack.isEmpty();
    }
}
