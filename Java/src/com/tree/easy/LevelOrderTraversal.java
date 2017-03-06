package com.tree.easy;

import com.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    private List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int level = q.size();
            List<Integer> levelList = new LinkedList<>();
            for (int i = 0; i < level; i++) {
                if (q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.offer(q.peek().right);
                }
                levelList.add(q.poll().val);
            }
            result.add(levelList);
        }
        return result;
    }

    public static void main(String[] args) {
        LevelOrderTraversal lot = new LevelOrderTraversal();
        TreeNode root = new TreeNode(4);
        TreeNode one = new TreeNode(5);
        TreeNode two = new TreeNode(6);
        TreeNode three = new TreeNode(7);
        TreeNode on = new TreeNode(8);
        TreeNode to = new TreeNode(9);
        TreeNode ne = new TreeNode(10);
        TreeNode wo = new TreeNode(11);

        root.left = one;
        root.right = on;
        one.left = to;
        one.right = wo;
        on.left = ne;
        to.left = three;
        three.left = two;
        System.out.println(lot.levelOrder(root));
    }
}
