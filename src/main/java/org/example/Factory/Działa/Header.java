package org.example.Factory.Działa;

// Klasa reprezentująca nagłówek kolumny w tabeli
abstract class Header {
    private String name;

    public Header(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Metody fabrykujące komórki
    public abstract Cell createCell(Object value);
    public abstract Cell createDefaultCell();
}
