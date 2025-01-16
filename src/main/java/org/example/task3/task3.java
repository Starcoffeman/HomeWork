package org.example.task3;

public class task3 {

    interface Animal {
        void makeSound();
    }

    public class Dog implements Animal {
        public void makeSound() {
            System.out.println("Woof!");
        }
    }

    public class Cat implements Animal {
        public void makeSound() {
            System.out.println("Meow!");
        }
    }

    public class Cow implements Animal {
        public void makeSound() {
            System.out.println("Moo!");
        }
    }
}
