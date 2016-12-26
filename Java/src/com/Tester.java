package com;

/**
 * Created by krutarthjoshi on 9/29/16.
 */
public class Tester {

    private int a;
    public double b;

    public Tester(int first, double second) {
        this.a = first;
        this.b = second;
    }

    public static void main(String[] args) {
        Tester c1 = new Tester(10, 20.5);
        Tester c2 = new Tester(10, 31.5);
        c2 = c1;
        c1.a = 2;
        System.out.println(c2.a);
    }
}