package org.example.Factory.zadanie2;

public abstract class Header {
    private String name;

    public Header(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Cell createCell(Object value);
    public abstract Cell createDefaultCell();
}