package org.example.Factory.Działa;

class NumberHeader extends Header {
    public NumberHeader(String name) {
        super(name);
    }

    @Override
    public Cell createCell(Object value) {
        if (value instanceof Number) {
            return new NumberCell((Number) value);
        } else {
            throw new IllegalArgumentException("Expected a Number");
        }
    }

    @Override
    public Cell createDefaultCell() {
        return new NumberCell(0);
    }
}
