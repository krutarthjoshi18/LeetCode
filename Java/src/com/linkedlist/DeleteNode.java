package com.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by krutarthjoshi on 11/2/16.
 */
public class DeleteNode {

    public static void main(String[] args) {
        List<ListNode> myLinkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            ListNode node = new ListNode(random.nextInt(100));
            myLinkedList.add(node);
        }

    }

    private static Random random = new Random();
}
