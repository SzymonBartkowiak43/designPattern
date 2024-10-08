package org.example.Singelton.zadanie2;

public class ConnectionManagerImpl implements ConnectionManager {
    private static ConnectionManager instance;
    private static final int MAX_POOL_SIZE = 3;
    private int objectCount = 0;
    private ConnectionManagerImpl() {
    }

    public static ConnectionManager getInstance() {
        if(instance == null) {
            instance = new ConnectionManagerImpl();
        }
        return instance;
    }

    @Override
    public DatabaseConnection getConnection(String databaseName) {
        objectCount++;
        Database database = Database.getInstance(databaseName);
        return database.getConnection();
    }
}
