package com.math.easy;

/**
 * Created by krutarthjoshi on 7/26/16.
 * LeetCode 204 - Count Primes
 * Description:
 * Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {

    public static void main(String[] args) {
        CountPrimes cp = new CountPrimes();
        System.out.println(cp.primeCount(499979));
    }

    private int primeCount(int n) {
        boolean[] notPrime = new boolean[n - 4];
        int prime = n - 2;
        for (long i = 2; i < n; i++)
            for (long j = i; i * j < n; j += i) {
                prime -= notPrime[(int) (i * j - 4)] ? 0 : 1;
                notPrime[(int) (i * j - 4)] = true;
            }
        return prime;
    }
}
