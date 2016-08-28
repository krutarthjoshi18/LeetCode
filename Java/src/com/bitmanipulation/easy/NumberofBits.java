package com.bitmanipulation.easy;

/**
 * Created by krutarthjoshi on 8/13/16.
 */
public class NumberofBits {

    public static void main(String[] args) {
        NumberofBits nb = new NumberofBits();
        System.out.println(nb.numBits(429967295));
    }

    private int numBits(int n) {
        int count = 0;
        String binary = Integer.toString(n, 2);
        for (int i = binary.length() - 1; i >= 0; i--) {
            count = binary.charAt(i) == '1' ? count + 1 : count;
        }
        return count;
    }
}
