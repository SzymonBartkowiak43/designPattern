package org.example.reszta.builder.houseInterface;

public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse() {
        houseBuilder.buildWindows();
        houseBuilder.buildFloors();
        houseBuilder.buildDoors();
        houseBuilder.buildGarage();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        houseBuilder.buildRooms();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }
}
