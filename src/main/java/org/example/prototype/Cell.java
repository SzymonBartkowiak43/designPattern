package org.example.prototype;

class Cell {
    private String value;

    public Cell(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%-15s", value);
    }
}