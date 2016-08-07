package com.math.easy;

/**
 * Created by krutarthjoshi on 7/26/16.
 */
public class PowerOfTwo {

    public static void main(String[] args) {
        PowerOfTwo pot = new PowerOfTwo();
        System.out.println(pot.isPowerofTwo(-9));
    }

    private boolean isPowerofTwo(int n) {
        return (n > 0 && (n & n - 1) == 0);
    }
}
