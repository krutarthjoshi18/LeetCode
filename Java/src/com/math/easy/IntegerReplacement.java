package com.math.easy;

/**
 * Created by krutarthjoshi on 9/21/16.
 */
public class IntegerReplacement {

    public static void main(String[] args) {
        IntegerReplacement ir = new IntegerReplacement();
        System.out.println(ir.numSteps(15));
    }

    private int numSteps(int n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                if (isPowerofTwo(n + 1)) {
                    n += 1;
                } else {
                    n -= 1;
                }
            }
            count++;
        }
        return count;
    }

    private boolean isPowerofTwo(int n) {
        return (n > 0 && (n & n - 1) == 0);
    }
}
