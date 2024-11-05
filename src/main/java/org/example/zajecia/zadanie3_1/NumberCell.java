package org.example.zajecia.zadanie3_1;

public class NumberCell extends Cell{
    private Integer value;

    public NumberCell(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%-15s", value.toString());
    }
}
