package com.math.easy;

/**
 * Created by krutarthjoshi on 7/27/16.
 * LeetCode 202 - Happy Number
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits,
 * and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 */
public class HappyNumber {

    public static void main(String[] args) {
        HappyNumber hn = new HappyNumber();
        System.out.println(hn.isHappy(65));
    }

    private boolean isHappy(int n) {
        int count = 0;
        while (count < 6) {
            n = getHappiness(n);
            if (n == 1) {
                return true;
            }
            count++;
        }
        System.out.println(count);
        return false;
    }

    private int getHappiness(int n) {
        int result = 0;
        while (n > 0) {
            int temp = n % 10;
            result += temp * temp;
            n /= 10;
        }
        return result;
    }
}
