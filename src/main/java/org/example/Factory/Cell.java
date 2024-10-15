package org.example.Factory;

abstract class Cell {
    protected String value;

    public Cell(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%-15s", value);
    }
}