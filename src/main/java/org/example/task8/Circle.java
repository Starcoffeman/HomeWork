package org.example.task8;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Circle extends Shape {
    private double radius;

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}