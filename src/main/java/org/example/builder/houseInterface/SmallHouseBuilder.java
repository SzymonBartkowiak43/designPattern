package org.example.builder.houseInterface;

public class SmallHouseBuilder implements HouseBuilder {

    private House house;

    public SmallHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("SmallWalls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("SmallFlors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("small rooms");
    }

    @Override
    public void buildRoof() {

    }

    @Override
    public void buildWindows() {

    }

    @Override
    public void buildDoors() {

    }

    @Override
    public void buildGarage() {

    }

    @Override
    public House getHouse() {
        return house;
    }
}
