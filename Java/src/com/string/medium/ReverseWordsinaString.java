package com.string.medium;

/**
 * Created by krutarthjoshi on 9/3/16.
 */
public class ReverseWordsinaString {

    public static void main(String[] args) {
        ReverseWordsinaString rwias = new ReverseWordsinaString();
        System.out.println(rwias.reverseWords("the sky is blue"));
    }

    private String reverseWords(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        s = s.trim();
        int l = s.length();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        reverseString(sb, 0, l - 1);
        System.out.println(sb);
        int j = 0;
        for (int i = 0; i < l; i++) {
            if (i == l - 1) {
                reverseString(sb, j, i);
            }
            if ((int) sb.charAt(i) == 32) {
                reverseString(sb, j, i - 1);
                j = i + 1;
            }
        }
        return sb.toString();
    }

    private void reverseString(StringBuilder sb, int i, int j) {
        while (i < j) {
            swap(sb, i, j);
            i++;
            j--;
        }
        return;
    }

    private void swap(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
        return;
    }
}
