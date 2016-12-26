package com.array.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krutarthjoshi on 11/30/16.
 * LeetCode 315 - Count of Smaller Numbers After Self
 * You are given an integer array nums and you have to return a new counts array. The counts array has the property where counts[i] is the number of smaller elements to the right of nums[i].
 * Example:
 * Given nums = [5, 2, 6, 1]
 * To the right of 5 there are 2 smaller elements (2 and 1).
 * To the right of 2 there is only 1 smaller element (1).
 * To the right of 6 there is 1 smaller element (1).
 * To the right of 1 there is 0 smaller element.
 * Return the array [2, 1, 1, 0].
 */
public class CountofSmallerNumberafterSelf {

    public static void main(String[] args) {
        CountofSmallerNumberafterSelf numberafterSelf = new CountofSmallerNumberafterSelf();
        int[] input = {5, 2, 6, 1};
        System.out.println(numberafterSelf.countSmaller(input));
    }

    public List<Integer> countSmaller(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int l = nums.length;
        if (l == 0) {
            return new ArrayList<Integer>() {
            };
        }
        return new ArrayList<Integer>() {
        };
    }
}
