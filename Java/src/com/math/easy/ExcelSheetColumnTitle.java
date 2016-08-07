package com.math.easy;

/**
 * Created by krutarthjoshi on 7/26/16.
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
