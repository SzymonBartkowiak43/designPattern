package org.example.Factory.zadanie2;

public class TextHeader extends Header{
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

