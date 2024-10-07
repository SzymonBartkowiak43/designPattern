package org.example.Singelton.zadanie2;

public class Ztp01 {

    public static void main(String[] args) {
        // Uzyskanie instancji Singletona
        ConnectionManager connectionManager = ConnectionManage.getInstance();

        // Uzyskanie połączenia do bazy danych "DB1"
        DatabaseConnection connection1 = connectionManager.getConnection("DB1");

        // Dalsze operacje na połączeniu
        int recordId = connection1.addRecord("John Doe", 30);
        connection1.showAllRecords();
    }

}