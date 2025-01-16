package org.example.task14;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle {
    private Point topLeft;
    private Point bottomRight;

    public double getArea() {
        double width = bottomRight.getX() - topLeft.getX();
        double height = topLeft.getY() - bottomRight.getY();
        return width * height;
    }
}
