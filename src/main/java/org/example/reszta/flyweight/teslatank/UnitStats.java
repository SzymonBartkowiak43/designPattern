package org.example.reszta.flyweight.teslatank;

import lombok.Getter;

@Getter
public class UnitStats {
    private String name;
    private int hp;
    private int armour;
    private int demageDealt;
    private int speed;
    private int cost;

    public UnitStats(String name, int hp, int armour, int demageDealt, int speed, int cost) {
        this.name = name;
        this.hp = hp;
        this.armour = armour;
        this.demageDealt = demageDealt;
        this.speed = speed;
        this.cost = cost;
    }
}
