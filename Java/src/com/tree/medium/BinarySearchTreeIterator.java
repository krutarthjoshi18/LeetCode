package com.tree.medium;

import com.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by krutarthjoshi on 3/5/17.
 */
public class BinarySearchTreeIterator {

    public Deque<TreeNode> stack;

    public BinarySearchTreeIterator(TreeNode root) {
        stack = new ArrayDeque<>();
        addLeftNodes(root);
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        TreeNode tempNode = stack.pop();
        addLeftNodes(tempNode.right);
        return tempNode.val;
    }

    private void addLeftNodes(TreeNode root) {
        while (true) {
            stack.push(root);
            root = root.left;
            if (root == null) {
                break;
            }
        }
    }

    public static void main(String[] args) {

    }
}
