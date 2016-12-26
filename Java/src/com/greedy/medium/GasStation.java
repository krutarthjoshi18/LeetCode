package com.greedy.medium;

/**
 * Created by krutarthjoshi on 10/4/16.
 */
public class GasStation {

    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        int[] cost = {1, 2, 3, 9, 5, 6, 7, 8, 9};
        int[] gas = {9, 8, 7, 6, 5, 4, 3, 2, 2};
        System.out.println(gasStation.canCompleteCircuit(gas, cost));
        char c = 10;
        System.out.println(c + "10");
    }

    private int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, total = 0, tank = 0;

        for (int i = 0; i < gas.length; i++) {
            tank += (gas[i] - cost[i]);
            if (tank < 0) {
                start = i + 1;
                total += tank;
                tank = 0;
            }
        }
        return (total + tank < 0) ? -1 : start;
    }
}
