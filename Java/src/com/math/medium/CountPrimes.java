package com.math.medium;

/**
 * Created by krutarthjoshi on 7/26/16.
 */
public class CountPrimes {

    public static void main(String[] args) {
        CountPrimes cp = new CountPrimes();
        System.out.println(cp.primeCount(15));
    }

    private int primeCount(int n) {
        boolean[] notPrime = new boolean[n + 1];
        for (int i = 2; i < n; i++) {
            for (int j = i; i * j < n; j++) {
                notPrime[i * j] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = notPrime[i] ? count : count + 1;
        }
        return count - 2;
    }
}
