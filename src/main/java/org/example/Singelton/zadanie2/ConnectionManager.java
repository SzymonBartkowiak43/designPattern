package org.example.Singelton.zadanie2;

public interface ConnectionManager {
    DatabaseConnection getConnection(String databaseName);
}
