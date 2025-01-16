package org.example.task19;

public class Smartphone extends Device {
    public Smartphone(String brand) {
        super(brand);
    }

    public void takePhoto() {
        System.out.println("Taking photo with smartphone.");
    }
}