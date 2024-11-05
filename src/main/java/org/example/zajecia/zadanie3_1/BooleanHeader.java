package org.example.zajecia.zadanie3_1;

public class BooleanHeader extends Header{
    public BooleanHeader(String name) {
        super(name);
    }

    @Override
    public Cell createCell(Object value) {
        if(value instanceof Boolean) {
            return new BooleanCell((Boolean) value);
        } else {
            throw new IllegalArgumentException("Bad value of boolean");
        }
    }

    @Override
    public Cell createDefaultCell() {
        return new BooleanCell(Boolean.FALSE);
    }
}
