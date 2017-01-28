package com.binarysearch.easy;

import java.util.Arrays;

/**
 * Created by krutarthjoshi on 1/17/17.
 */
public class Heaters {

    public static void main(String[] args) {
        Heaters heater = new Heaters();
        int[] houses = {10};
        int[] heaters = {1, 2, 3};
        System.out.println(heater.findRadius(houses, heaters));
    }

    public int findRadius(int[] houses, int[] heaters) {
        if (houses == null || heaters == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int l = heaters.length;
        int j = 0;
        int radius = Integer.MIN_VALUE;
        for (int i = 0; i < houses.length; i++) {
            while (j < l && heaters[j] < houses[i]) {
                j++;
            }
            if (j == 0) {
                radius = Math.max(radius, heaters[0] - houses[i]);
            } else if (j > 0 && j < l) {
                radius = Math.max(radius, Math.min(houses[i] - heaters[j - 1], heaters[j] - houses[i]));
            } else {
                radius = Math.max(radius, houses[i] - heaters[l - 1]);
            }
        }
        return radius;
    }
}
