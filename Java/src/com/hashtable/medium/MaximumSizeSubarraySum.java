package com.hashtable.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by krutarthjoshi on 1/24/17.
 */
public class MaximumSizeSubarraySum {

    public int maxSubArrayLen(int[] nums, int k) {
        int sum = 0, max = 0;
        int start = 0;
        int end = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                max = i + 1;
                end = i;
            } else if (map.containsKey(sum - k)) {
                if ((i - map.get(sum - k)) >= max) {
                    start = map.get(sum - k) + 1;
                    end = i;
                }
                max = Math.max(max, i - map.get(sum - k));
            }
            if (!map.containsKey(sum)) map.put(sum, i);
        }
        System.out.println(start + ":" + end);
        //System.out.println(end);
        return max;
    }

    public static void main(String[] args) {
        int lo = 0;
        int hi = 1;
        String s = "";
        if (Character.toLowerCase(s.charAt(lo)) == Character.toLowerCase(s.charAt(hi))) {
        }
        MaximumSizeSubarraySum msss = new MaximumSizeSubarraySum();
        System.out.println(msss.maxSubArrayLen(new int[]{1, -1, 5, -2, 3}, 3));
    }
}
