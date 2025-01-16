package org.example.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private String gender;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }

    public void increaseAge() {
        this.age++;
    }
}
