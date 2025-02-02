package org.example.reszta.prototype;

public class Ztp02 {
    public static void main(String[] args) {
        // Tworzymy tabelę
        Table table = new Table();

        // Dodajemy kolumny
        table.addColumn(new Header("Name"));
        table.addColumn(new Header("Age"));
        table.addColumn(new Header("City"));

        // Dodajemy wiersze
        table.addRow("Alice", "30", "New York");
        table.addRow("Bob", "25", "Los Angeles");
        table.addRow("Charlie", "35", "Chicago");

        // Wyświetlamy tabelę
        System.out.println(table.toString());
    }
}