package org.example.zajecia.zadanie3_1;

public class Program {
    public static void main(String[] args) {
        // Tworzymy tabelę
        Table table = new Table();

        // Dodajemy kolumny
        table.addColumn(new TextHeader("Name"));
        table.addColumn(new NumberHeader("Age"));
        table.addColumn(new BooleanHeader("Is student"));

        // Dodajemy wiersze
        table.addRow("Alice",30, true);
        table.addRow("Bob",20, true);
        table.addRow("Charlie",16, false);

        // Wyświetlamy tabelę
        System.out.println(table.toString());
    }
}
