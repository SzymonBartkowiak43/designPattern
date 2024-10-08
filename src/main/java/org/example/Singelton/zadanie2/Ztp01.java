package org.example.Singelton.zadanie2;

public class Ztp01 {

    public static void main(String[] args) {
        ConnectionManager connectionManager = ConnectionManagerImpl.getInstance();

        DatabaseConnection connection1 = connectionManager.getConnection("DB1");

        if (connection1 != null) {
            connection1.addRecord("Karol", 23);
            connection1.showAllRecords();
        }


    }

}