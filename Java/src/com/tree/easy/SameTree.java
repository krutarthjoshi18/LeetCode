package com.tree.easy;

import com.TreeNode;

/**
 * Created by krutarthjoshi on 2/26/17.
 */


public class SameTree {

    private boolean isTreeSame(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        if (p.val == q.val) {
            return isTreeSame(p.left, q.left) && isTreeSame(p.right, q.right);
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
