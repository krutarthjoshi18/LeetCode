package com.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krutarthjoshi on 11/26/16.
 * LeetCode 448 - Find All Numbers Disappeared in an Array
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 * Output:
 * [5,6]
 */
public class FindallNumbersDisappearedinArray {

    public static void main(String[] args) {
        FindallNumbersDisappearedinArray array = new FindallNumbersDisappearedinArray();
        System.out.println(array.findDisappearedNumbers(new int[]{1, 2, 3, 4, 5, 4, 3, 2}));
    }

    private List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int l = nums.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= l; i++) {
            result.add(i);
        }
        for (int num : nums) {
            if (result.contains(num)) {
                result.remove(result.indexOf(num));
            }
        }
        String s  = "";
        s.indexOf('s');
        return result;
    }
}
