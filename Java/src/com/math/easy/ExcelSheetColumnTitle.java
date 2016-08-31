package com.math.easy;

/**
 * Created by krutarthjoshi on 7/26/16.
 * LeetCode 168 - Excel Sheet Column Title
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * For example:
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 */
public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        ExcelSheetColumnTitle esct = new ExcelSheetColumnTitle();
        System.out.println(esct.getSheetColumn(543));
    }

    private String getSheetColumn(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int carry = n % 26 == 0 ? 26 : n % 26;
            int curr = 'A' + carry - 1;
            sb.append((char) curr);
            n = (n - 1) / 26;
        }
        return sb.toString();
    }
}
