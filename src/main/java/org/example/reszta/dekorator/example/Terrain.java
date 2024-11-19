package org.example.reszta.dekorator.example;

import lombok.Getter;

abstract public class Terrain {
    @Getter
    private String decryption;
    private int fuelCost;

    public Terrain(String decryption, int fuelCost) {
        this.decryption = decryption;
        this.fuelCost = fuelCost;
    }

    public int fuelCost() {
        return fuelCost;
    }

}
