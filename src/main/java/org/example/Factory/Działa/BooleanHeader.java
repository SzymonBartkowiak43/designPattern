package org.example.Factory.Działa;

class BooleanHeader extends Header {
    public BooleanHeader(String name) {
        super(name);
    }

    @Override
    public Cell createCell(Object value) {
        if (value instanceof Boolean) {
            return new BooleanCell((Boolean) value);
        } else {
            throw new IllegalArgumentException("Expected a Boolean");
        }
    }

    @Override
    public Cell createDefaultCell() {
        return new BooleanCell(false);
    }
}