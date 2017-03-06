package com.tree.easy;

import com.TreeNode;

/**
 * Created by krutarthjoshi on 2/26/17.
 */
public class ConvertSortedArraytoBST {

    private TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        int mid = lo + (hi - lo) >> 1;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, lo, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, hi);
        return node;
    }
}
