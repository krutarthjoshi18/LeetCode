package com.array.easy;

import java.util.*;

/**
 * Created by krutarthjoshi on 6/22/16.
 * LeetCode 1 - Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] input = {2, 7, 11, 15, 4, 5};
        System.out.println(ts.twoSum(input, 9));
    }

    private List<List<Integer>> twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        //Set<Integer> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(target - nums[i]);
                result.add(temp);
            }
            map.put(target - nums[i], i);
        }
        return result;
    }
}
