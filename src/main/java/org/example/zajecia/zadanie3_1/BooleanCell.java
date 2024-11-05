package org.example.zajecia.zadanie3_1;

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
