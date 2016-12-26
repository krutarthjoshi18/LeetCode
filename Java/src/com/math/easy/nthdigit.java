package com.math.easy;

/**
 * Created by krutarthjoshi on 9/22/16.
 */
public class nthdigit {

    public static void main(String[] args) {
        nthdigit nthdigit = new nthdigit();
        System.out.println(nthdigit.integerReplacement(45));
    }

    private int integerReplacement(int n) {
        long fizz = 9;
        int l = 1;
        int prevFizz = 0;
        while ((l * fizz) < n) {
            n -= (l * fizz);
            prevFizz += fizz;
            l++;
            fizz *= 10;
        }
        prevFizz += (n - 1) / l + 1;
        System.out.println(prevFizz);
        String s = Integer.toString(prevFizz);
        return Character.getNumericValue(s.charAt((n - 1) % l));
    }

}
