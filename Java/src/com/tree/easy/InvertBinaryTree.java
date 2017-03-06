package com.tree.easy;

import com.TreeNode;

/**
 * Created by krutarthjoshi on 2/26/17.
 */
public class InvertBinaryTree {

    private TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTree ibt = new InvertBinaryTree();
        System.out.println(ibt.invertTree(new TreeNode(20)));
    }
}
