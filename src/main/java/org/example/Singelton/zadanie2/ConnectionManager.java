package org.example.Singelton.zadanie2;

interface ConnectionManager {
    DatabaseConnection getConnection(String databaseName);
}