package com.array.easy;

/**
 * Created by krutarthjoshi on 6/16/16.
 * LeetCode 169 - Majority Element
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {

    public static void main(String[] args) {
        MajorityElement ml = new MajorityElement();
        int input[] = {6, 5, 5};
        System.out.println(ml.majorityElement(input));
    }

    private int majorityElement(int[] A) {
        int result = A[0];
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if (count == 0) {
                result = A[i];
                count++;
            } else {
                if (result == A[i]) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return result;
    }
}
