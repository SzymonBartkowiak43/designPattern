package org.example.prototype;

import java.util.ArrayList;
import java.util.List;

class Table {
    private List<Header> headers = new ArrayList<>();  // Lista nagłówków kolumn
    private List<List<Cell>> rows = new ArrayList<>(); // Lista wierszy (każdy wiersz to lista komórek)

    public void addColumn(Header header) {
        headers.add(header);

        // Dodajemy puste komórki do każdego z istniejących wierszy
        for (List<Cell> row : rows) {
            row.add(new Cell(""));
        }
    }

    public void addRow(String... cellValues) {
        if (cellValues.length != headers.size()) {
            throw new IllegalArgumentException("Liczba wartości nie zgadza się z liczbą kolumn.");
        }

        // Dodajemy wiersz wypełniony komórkami z wartością
        List<Cell> newRow = new ArrayList<>();
        for (String value : cellValues) {
            newRow.add(new Cell(value));
        }
        rows.add(newRow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Dodajemy nagłówki
        for (Header header : headers) {
            sb.append(String.format("%-15s", header.getName()));
        }
        sb.append("\n");

        // Separator
        sb.append("-".repeat(headers.size() * 15)).append("\n");

        // Dodajemy wiersze
        for (List<Cell> row : rows) {
            for (Cell cell : row) {
                sb.append(cell.toString());
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}