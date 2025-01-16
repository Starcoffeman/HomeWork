package org.example.task19;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Device {
    private String brand;

    public void turnOn() {
        System.out.println(brand + " device is turned on.");
    }

    public void turnOff() {
        System.out.println(brand + " device is turned off.");
    }
}
