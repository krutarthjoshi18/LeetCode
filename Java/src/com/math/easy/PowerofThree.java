package com.math.easy;

/**
 * Created by krutarthjoshi on 7/27/16.
 * LeetCode 326 - Power of Three
 * Given an integer, write a function to determine if it is a power of three.
 */
public class PowerofThree {

    public static void main(String[] args) {
        PowerofThree pot = new PowerofThree();
        System.out.println(pot.isPowerofThree1(98));
        System.out.println(pot.isPowerofThree2(98));
        System.out.println(pot.isPowerofThree3(729));
    }

    private boolean isPowerofThree1(int n) {
        return n > 0 && (n == 1 || n % 3 == 0 && isPowerofThree1(n / 3));
    }

    private boolean isPowerofThree2(int n) {
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    private boolean isPowerofThree3(int n) {
        String s = Integer.toString(n, 3);
        if (s.charAt(0) != '1') {
            return false;
        }
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }
}
