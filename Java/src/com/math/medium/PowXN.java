package com.math.medium;

/**
 * Created by krutarthjoshi on 10/21/16.
 */
public class PowXN {

    public static void main(String[] args) {
        PowXN powXN = new PowXN();
        System.out.println(powXN.pow(4, 3));
        int n = 5;
        while (n > 0) {
            if ((n & 1) == 1) {
                //result *= temp;
                System.out.println(n);
            }
            n = n >> 1;

        }
    }

    private double pow(double x, double n) {
        return 2d;
    }
}
