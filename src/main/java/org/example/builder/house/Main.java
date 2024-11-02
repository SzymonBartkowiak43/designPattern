package org.example.builder.house;

import org.example.builder.house.House;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .buildFloors("Floors")
                .buildWalls("Wall")
                .build();

        System.out.println(house.toString());
     }
}
