package com.tree.easy;

import com.TreeNode;

/**
 * Created by krutarthjoshi on 2/26/17.
 */
public class LowestCommonAncestorBST {

    private TreeNode LCABST(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val > p.val && root.val > q.val) {
            return LCABST(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val) {
            return LCABST(root.right, p, q);
        }
        return root;
    }

    public static void main(String[] args) {
        LowestCommonAncestorBST lcabst = new LowestCommonAncestorBST();
        System.out.println(lcabst.LCABST(new TreeNode(10), new TreeNode(5), new TreeNode(3)));
    }
}
