package org.example.zajecia.zadanie3_2;

class BooleanCell extends Cell {
    private Boolean value;

    public BooleanCell(Boolean value) {
        this.value = value;
    }

    @Override
    public Cell clone() {
        return new BooleanCell(this.value);
    }

    @Override
    public void setValue(Object value) {
        this.value = (Boolean) value;
    }

    @Override
    public String toString() {
        return String.format("%-15s", value);
    }
}
