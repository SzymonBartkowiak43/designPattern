package org.example.zajecia.zadanie3_1;

public class TextCell extends Cell{
    private String value;

    public TextCell(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%-15s", value);
    }
}
