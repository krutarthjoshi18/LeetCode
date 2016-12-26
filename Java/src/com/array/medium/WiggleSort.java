package com.array.medium;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 9/20/16.
 * LeetCode 280 - Wiggle Sort
 * Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....
 * For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].
 */

public class WiggleSort {

    public static void main(String[] args) {
        WiggleSort wiggleSort = new WiggleSort();
        int[] input = {3, 5, 2, 1, 6, 4};
        wiggleSort.wiggleSort(input);
        System.out.println(Arrays.toString(input));
    }

    private void wiggleSort(int[] in) {
        int l = in.length;
        int[] out = in.clone();
        Arrays.sort(out);
        int j = 0;
        int k = l % 2 == 0 ? l - 1 : l - 2;
        for (int i = 0; i < l; i++)
            if (j < l) {
                in[j] = out[i];
                j += 2;
            } else {
                in[k] = out[i];
                k -= 2;
            }
    }
}
