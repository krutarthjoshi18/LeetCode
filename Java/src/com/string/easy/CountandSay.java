package com.string.easy;

/**
 * Created by krutarthjoshi on 7/17/16.
 *
 */
public class CountandSay {

    public static void main(String[] args) {
        CountandSay cas = new CountandSay();
        System.out.println(cas.countandSay(4));
    }

    private String countandSay(int n) {
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        StringBuilder result = new StringBuilder("21");
        int i = 3;
        while (i < n) {
            result = countandSay(result);
            i++;
        }
        return result.toString();
    }

    private StringBuilder countandSay(StringBuilder inp) {
        StringBuilder sb = new StringBuilder();
        char prev = inp.charAt(0);
        char curr = inp.charAt(1);
        int count = 1;
        int i = 1;
        while (true) {
            if (curr != prev) {
                sb.append(count);
                sb.append(prev);
                prev = curr;
                count = 1;
            } else {
                count++;
            }
            i++;
            if (i == inp.length()) {
                break;
            }
            curr = inp.charAt(i);
        }
        return sb;
    }
}
