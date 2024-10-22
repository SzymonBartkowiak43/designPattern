package org.example.Factory.pro;

class NumberCell extends Cell {
    private Integer value;

    public NumberCell(Integer value) {
        this.value = value;
    }

    @Override
    public Cell clone() {
        return new NumberCell(this.value);
    }

    @Override
    public void setValue(Object value) {
        this.value = (Integer) value;
    }

    @Override
    public String toString() {
        return String.format("%-15s", value);
    }
}
