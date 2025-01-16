package org.example.task8;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Rectangle extends Shape {
    private double width;
    private double height;

    @Override
    double getArea() {
        return width * height;
    }
}