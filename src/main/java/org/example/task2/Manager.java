package org.example.task2;

public class Manager extends Worker {
    private int numSubordinates;

    public Manager(String name, int age, String gender, double salary, int numSubordinates) {
        super(name, age, gender, salary);
        this.numSubordinates = numSubordinates;
    }

    public int getNumSubordinates() {
        return numSubordinates;
    }
}