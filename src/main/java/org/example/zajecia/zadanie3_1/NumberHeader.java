package org.example.zajecia.zadanie3_1;

public class NumberHeader extends Header{
    public NumberHeader(String name) {
        super(name.toString());
    }

    @Override
    public Cell createCell(Object value) {
        if(value instanceof Integer) {
            return new NumberCell((Integer) value);
        } else {
            throw new IllegalArgumentException("Bad value of int");
        }
    }

    @Override
    public Cell createDefaultCell() {
        return new NumberCell(1);
    }
}
