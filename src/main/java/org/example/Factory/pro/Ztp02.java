package org.example.Factory.pro;

public class Ztp02 {
    public static void main(String[] args) {
        Table table = new Table();

        table.addColumn(new Header("Name", new TextCell("")));
        table.addColumn(new Header("Age", new NumberCell(0)));
        table.addColumn(new Header("Is Student", new BooleanCell(false)));

        table.addRow("Alice", 30, false);
        table.addRow("Bob", 25, true);
        table.addRow("Charlie", 35, false);

        System.out.println(table.toString());
    }
}
