package org.example.Singelton.zadanie2;

public class ConnectionManager {
    private static ConnectionManager instance;

    private ConnectionManager() {}

    public static synchronized ConnectionManager getInstance() {
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    public DatabaseConnection getConnection(String databaseName) {
        Database database = Database.getInstance(databaseName);
        return database.getConnection();
    }
}