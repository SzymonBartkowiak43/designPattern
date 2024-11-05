package org.example.zajecia.zadanie2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionManagerImpl implements ConnectionManager {
    private static ConnectionManager instance;
    private static final int MAX_POOL_SIZE = 3;
    private Map<String, List<DatabaseConnection>> connectionPools = new HashMap<>();
    private Map<String, Integer> connectionIndexes = new HashMap<>();

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
        if (!connectionPools.containsKey(databaseName)) {
            connectionPools.put(databaseName, new ArrayList<>());
            connectionIndexes.put(databaseName, 0);
        }

        List<DatabaseConnection> pool = connectionPools.get(databaseName);
        int index = connectionIndexes.get(databaseName);


        if (pool.size() < MAX_POOL_SIZE) {
            DatabaseConnection connection = Database.getInstance(databaseName).getConnection();
            pool.add(connection);
        }

        DatabaseConnection currentConnection = pool.get(index);
        connectionIndexes.put(databaseName, (index + 1) % MAX_POOL_SIZE);

        return currentConnection;
    }
}
