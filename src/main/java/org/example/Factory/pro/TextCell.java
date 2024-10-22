package org.example.Factory.pro;

class TextCell extends Cell {
    private String value;

    public TextCell(String value) {
        this.value = value;
    }

    @Override
    public Cell clone() {
        return new TextCell(this.value);
    }

    @Override
    public void setValue(Object value) {
        this.value = (String) value;
    }

    @Override
    public String toString() {
        return String.format("%-15s", value);
    }
}
