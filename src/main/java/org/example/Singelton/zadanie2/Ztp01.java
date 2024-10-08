package org.example.Singelton.zadanie2;

public class Ztp01 {

    public static void main(String[] args) {
        ConnectionManager connectionManager = ConnectionManager.getInstance();

        DatabaseConnection connection1 = connectionManager.getConnection("DB1");

        if (connection1 != null) {
            connection1.addRecord("Karol", 23);
            connection1.showAllRecords();
        }

        DatabaseConnection connection2 = connectionManager.getConnection("DB1");

        if (connection2 != null) {
            connection2.addRecord("Anna", 30);
            connection2.showAllRecords();
        }

        DatabaseConnection connection3 = connectionManager.getConnection("DB2");

        if (connection3 != null) {
            connection3.addRecord("Robert", 45);
            connection3.showAllRecords();
        }

    }

}