package org.example.Singelton.zadanie2;

public class Ztp01 {

    public static void main(String[] args) {
        ConnectionManager connectionManager = ConnectionManagerImpl.getInstance();

        DatabaseConnection connection1 = connectionManager.getConnection("DB1");
        DatabaseConnection connection2 = connectionManager.getConnection("DB1");
        DatabaseConnection connection3 = connectionManager.getConnection("DB1");
        DatabaseConnection connection4 = connectionManager.getConnection("DB1");


        connection1.addRecord("Karol", 23);
        connection2.addRecord("Karol1", 23);
        connection3.addRecord("Karol2", 23);
        connection4.addRecord("Karol3", 23);


        System.out.println("C1:");
        connection1.showAllRecords();
        System.out.println("C2:");
        connection2.showAllRecords();
        System.out.println("C3:");
        connection3.showAllRecords();
        System.out.println("C4:");
        connection4.showAllRecords();

        if (connection1.hashCode() == connection3.hashCode()) {
            System.out.println("connection1 i connection4 to ten sam obiekt.");
        } else {
            System.out.println("connection1 i connection4 to różne obiekty.");
        }




    }

}