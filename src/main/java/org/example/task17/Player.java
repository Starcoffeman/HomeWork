package org.example.task17;

public class Player {
    private String name;
    private int health;

    public Player(String name) {
        this.name = name;
        this.health = 100;
    }

    public void attack(Enemy enemy) {
        System.out.println(name + " attacks " + enemy.getName());
        enemy.takeDamage(10);
    }
}
