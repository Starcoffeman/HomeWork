package org.example.task9;

public class all {

    class Fish extends Animal {
        @Override
        void move() {
            System.out.println("Fish is swimming");
        }
    }

    class Bird extends Animal {
        @Override
        void move() {
            System.out.println("Bird is flying");
        }
    }

    class Dog extends Animal {
        @Override
        void move() {
            System.out.println("Dog is running");
        }
    }

}
