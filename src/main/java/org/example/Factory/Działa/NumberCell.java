package org.example.Factory.Działa;

public class NumberCell extends Cell {
    private Number value;

    public NumberCell(Number value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%-15s", value.toString());
    }
}
