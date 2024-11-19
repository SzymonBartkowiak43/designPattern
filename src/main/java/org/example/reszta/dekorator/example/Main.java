package org.example.reszta.dekorator.example;

public class Main {
    public static void main(String[] args) {
        generateMap();
    }

    private static void generateMap() {
        Terrain terrain = new Plain();
        Terrain terrain1 = new Hill();
        Terrain terrain2 = new SwampDecorator(new Hill());
        Terrain terrain3 = new SwampDecorator(new ForestDecorator(new Plain()));
        Terrain terrain4 = new RoadDecorator(new Hill());

        System.out.println("Terrain 2: " + terrain2.fuelCost());
        System.out.println("Terrain 3: " + terrain3.fuelCost());
        System.out.println("Terrain 4: " + terrain4.fuelCost());


    }
}
