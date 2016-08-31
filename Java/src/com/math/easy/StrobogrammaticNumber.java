package com.math.easy;

import java.util.HashMap;

/**
 * Created by krutarthjoshi on 8/30/16.
 * LeetCode 246 - Strobogrammatic Number
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
 * Write a function to determine if a number is strobogrammatic. The number is represented as a string.
 * For example, the numbers "69", "88", and "818" are all strobogrammatic.
 */
public class StrobogrammaticNumber {

    public static void main(String[] args) {
        StrobogrammaticNumber sn = new StrobogrammaticNumber();
        System.out.println(sn.isStrobogrammatic("8651810698"));
    }

    private boolean isStrobogrammatic(String num) {
        if (num == null) {
            return false;
        }
        int l = num.length();
        if (l == 0) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(6, 9);
        map.put(9, 6);
        map.put(8, 8);
        map.put(1, 1);
        map.put(0, 0);
        int lo = 0;
        int hi = l - 1;
        while (lo <= hi) {
            int loNum = num.charAt(lo) - '0';
            int hiNum = num.charAt(hi) - '0';
            if (!map.containsKey(loNum) || map.get(loNum) != hiNum) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }

}
