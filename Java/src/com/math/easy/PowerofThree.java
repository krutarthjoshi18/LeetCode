package com.math.easy;

/**
 * Created by krutarthjoshi on 7/27/16.
 * LeetCode 326 - Power of Three
 * Given an integer, write a function to determine if it is a power of three.
 */
public class PowerofThree {

    public static void main(String[] args) {
        PowerofThree pot = new PowerofThree();
        System.out.println(pot.isPowerofThree(98));
    }

    private boolean isPowerofThree(int n) {
        return n > 0 && (n == 1 || n % 3 == 0 && isPowerofThree(n / 3));
    }

}
