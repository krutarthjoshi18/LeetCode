package com.stack.easy;

import java.util.Stack;

/**
 * Created by krutarthjoshi on 10/21/16.
 * LeetCode 232 - Implement Queue using Stacks
 * Implement the following operations of a queue using stacks.
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * Notes:
 * You must use only standard operations of a stack --
 * which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, stack may not be supported natively.
 * You may simulate a stack by using a list or deque (double-ended queue),
 * as long as you use only standard operations of a stack.
 * You may assume that all operations are valid
 * (for example, no pop or peek operations will be called on an empty queue).
 */
public class ImplementQueueUsingStack {

    Stack<Integer> queue = new Stack<>();
    Stack<Integer> stack = new Stack<>();
    int queueFront = 0;

    public static void main(String[] args) {
        ImplementQueueUsingStack implementQueueUsingStack = new ImplementQueueUsingStack();

    }

    // Push element x to the back of queue.
    public void push(int x) {
        if (stack.empty())
            queueFront = x;
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (queue.isEmpty()) {
            while (!stack.isEmpty()) {
                queue.push(stack.pop());
            }
        }
        queue.pop();
    }

    // Get the front element.
    public int peek() {
        if (!queue.isEmpty()) {
            return queue.peek();
        }
        return queueFront;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty() && queue.isEmpty();
    }
}
