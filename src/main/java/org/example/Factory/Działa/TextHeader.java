package org.example.Factory.Działa;

class TextHeader extends Header {
    public TextHeader(String name) {
        super(name);
    }

    @Override
    public Cell createCell(Object value) {
        return new TextCell(value.toString());
    }

    @Override
    public Cell createDefaultCell() {
        return new TextCell("");
    }
}