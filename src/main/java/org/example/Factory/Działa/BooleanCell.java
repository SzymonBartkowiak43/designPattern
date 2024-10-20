package org.example.Factory.Działa;

public class BooleanCell extends Cell {
    private Boolean value;

    public BooleanCell(Boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%-15s", value ? "true" : "false");
    }
}
