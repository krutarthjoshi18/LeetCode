package com.string.easy;

/**
 * Created by krutarthjoshi on 12/17/16.
 * Number of Segments in a String
 */
public class NumSegments {

    public static void main(String[] args) {
        NumSegments segments = new NumSegments();
        System.out.println(segments.numSegments("   foo    bar"));
    }

    private int numSegments(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int l = s.length();
        if (l == 0) {
            return 0;
        }
        return 1;
    }
}
