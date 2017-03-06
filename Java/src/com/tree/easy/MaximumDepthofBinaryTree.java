package com.tree.easy;

import com.TreeNode;

/**
 * Created by krutarthjoshi on 2/26/17.
 */
public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        MaximumDepthofBinaryTree mdobt = new MaximumDepthofBinaryTree();
        mdobt.maxDepth(new TreeNode(10));
    }
}
