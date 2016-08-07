package com.string.easy;

import java.util.Stack;

/**
 * Created by krutarthjoshi on 7/18/16.
 */
public class ValidParenthesis {

    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        System.out.println(vp.isValidParenthesis("(){}[[]"));
    }

    private boolean isValidParenthesis(String s) {
        char[] arr = s.toCharArray();
        Stack stack = new Stack();
        for (char ch : arr) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                char top = (char) stack.lastElement();
                if (ch - top == 1 || ch - top == 2) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        return stack.isEmpty();
    }
}
