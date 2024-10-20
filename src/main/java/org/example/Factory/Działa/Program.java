package org.example.Factory.Działa;

public class Program {
    public static void main(String[] args) {
        // Tworzymy tabelę
        Table table = new Table();

        // Dodajemy kolumny
        table.addColumn(new TextHeader("Name"));
        table.addColumn(new NumberHeader("Age"));
        table.addColumn(new BooleanHeader("IsStudent"));

        // Dodajemy wiersze
        table.addRow("Alice", 30, true);
        table.addRow("Bob", 25, false);
        table.addRow("Charlie", 35, true);

        // Wyświetlamy tabelę
        System.out.println(table.toString());
    }
}
