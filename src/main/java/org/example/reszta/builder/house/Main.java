package org.example.reszta.builder.house;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .buildFloors("Floors")
                .buildWalls("Wall")
                .build();

        System.out.println(house.toString());
     }
}
