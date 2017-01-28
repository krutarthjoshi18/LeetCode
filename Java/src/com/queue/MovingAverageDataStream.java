package com.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by krutarthjoshi on 1/18/17.
 */
public class MovingAverageDataStream {

    public static void main(String[] args) {

    }

    private int next(int input) {
        Queue<Integer> queue = new LinkedList<>();
        queue.poll();
        queue.add(8);
        return -1;
    }
}

