package org.example.task4;

public class task4 {

    abstract class Transport {
        abstract void move();
    }

    class Car extends Transport {
        public void move() {
            System.out.println("Car is driving");
        }
    }

    class Bike extends Transport {
        public void move() {
            System.out.println("Bike is cycling");
        }
    }

}
