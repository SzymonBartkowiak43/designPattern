package org.example.reszta.dekorator.example;

public class RoadDecorator extends TerrainDecorator{

    public RoadDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public String getDecryption() {
        return terrain.getDecryption();
    }

    @Override
    public int fuelCost() {
        return terrain.fuelCost() - 10;
    }
}
