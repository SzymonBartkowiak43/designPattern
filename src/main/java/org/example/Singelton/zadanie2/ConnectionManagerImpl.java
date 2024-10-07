package org.example.Singelton.zadanie2;

public class ConnectionManagerImpl implements ConnectionManager {
    // Statyczne pole przechowujące jedyną instancję Singletona
    private static ConnectionManagerImpl instance;

    // Prywatny konstruktor, aby zablokować tworzenie instancji spoza klasy
    private ConnectionManagerImpl() {}

    // Statyczna metoda do uzyskiwania instancji Singletona
    public static ConnectionManagerImpl getInstance() {
        if (instance == null) {
            synchronized (ConnectionManagerImpl.class) {
                if (instance == null) {
                    instance = new ConnectionManagerImpl();
                }
            }
        }
        return instance;
    }

    @Override
    public DatabaseConnection getConnection(String databaseName) {
        // Logika tworzenia lub uzyskiwania połączenia z bazą danych
        return new DatabaseConnectionImpl(); // Przykładowa implementacja
    }
}
