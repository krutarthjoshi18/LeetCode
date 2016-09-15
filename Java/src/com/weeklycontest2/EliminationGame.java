package com.weeklycontest2;

import java.util.ArrayList;

/**
 * Created by krutarthjoshi on 8/27/16.
 *
 */
public class EliminationGame {

    public static void main(String[] args) {
        System.out.println(lastRemaining(9));
    }

    private static int lastRemaining(int n) {
        ArrayList<Integer> list = new ArrayList<>(n + 1);
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        int flag = 0;
        while (list.size() > 1) {
            if (flag == 0) {
                removeFromFront(list);
                flag = 1;
            } else {
                removeFromBack(list);
                flag = 0;
            }
        }
        System.out.println(list);
        return list.get(0);
    }

    private static void removeFromFront(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            list.set(i, 0);
        }
        for (int i = 0; i < size; i++) {
            if (list.get(i) == 0) {
                list.remove(i);
            }
        }
    }

    private static void removeFromBack(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = size; i >= 0; i -= 2) {
            list.set(i, 0);
        }
        for (int i = size - 1; i >= 0; i -= 2) {
            if (list.get(i) == 0) {
                list.remove(i);
            }
        }
    }
}
