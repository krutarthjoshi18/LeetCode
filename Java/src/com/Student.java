package com;

/**
 * Created by krutarthjoshi on 9/29/16.
 */
public class Student extends Person {

    private int id;

    public Student(String n, int id) {
        super(n);
        this.id = id;
    }

    public String toString() {
        return ", " + id;
    }

    public String[] enjoy() {
        return new String[]{"a", "b"};
    }
}
