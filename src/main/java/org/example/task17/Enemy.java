package org.example.task17;

import lombok.Getter;

@Getter
public class Enemy {
    private String name;
    private int health;

    public Enemy(String name) {
        this.name = name;
        this.health = 100;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " takes " + damage + " damage");
    }

}
