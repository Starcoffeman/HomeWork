package org.example.task17;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Weapon {
    private String type;

    public void use() {
        System.out.println("Using weapon: " + type);
    }
}
