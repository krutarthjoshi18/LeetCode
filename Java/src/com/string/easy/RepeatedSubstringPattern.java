package com.string.easy;

/**
 * Created by krutarthjoshi on 11/26/16.
 */
public class RepeatedSubstringPattern {

    public static void main(String[] args) {
        RepeatedSubstringPattern pattern = new RepeatedSubstringPattern();
        System.out.println(pattern.isSubstringRepeated("ababab"));
        System.out.println(pattern.isSubStringRepeated("ababab"));
    }

    private boolean isSubstringRepeated(String s) {
        int l = s.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                int m = l / i;
                String subS = s.substring(0, i);
                int j;
                for (j = 1; j < m; j++) {
                    if (!subS.equals(s.substring(j * i, i + j * i))) {
                        break;
                    }
                }
                if (j == m)
                    return true;
            }
        }
        return false;
    }

    private boolean isSubStringRepeated(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
                53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113,
                127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191,
                193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257};
        int l = s.length();
        if (l == 0) {
            return false;
        }
        int index = 0;
        int count;
        while (index < primes.length && primes[index] < l) {
            count = primes[index];
            //System.out.println(index);
            if (l % count == 0) {
                int len = l / count;
                System.out.println("Len is: " + len);
                String subS = s.substring(0, len);
                System.out.println(subS);
                int i;
                for (i = 1; i < count; i++) {
                    if (!subS.equals(s.substring(i * len, len + len * i))) {
                        break;
                    }
                }
                if (i == count) {
                    return true;
                }
            }
            index++;
        }
        return false;
    }
}