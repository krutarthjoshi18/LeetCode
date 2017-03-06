package com.tree.easy;

import com.TreeNode;

/**
 * Created by krutarthjoshi on 2/26/17.
 */
public class ClosestValue {

    private int closestValue(TreeNode root, double target) {
        int lo = root.val;
        TreeNode closestNode = lo < target ? root.right : root.left;
        if (closestNode == null) {
            return lo;
        }
        int hi = closestValue(closestNode, target);
        return Math.abs(lo - target) < Math.abs(hi - target) ? lo : hi;
    }

    public static void main(String[] args) {
        ClosestValue cv = new ClosestValue();
        cv.closestValue(new TreeNode(10), 9.8);
    }
}
