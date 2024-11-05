package org.example.zajecia.zadanie2;

interface ConnectionManager {
    DatabaseConnection getConnection(String databaseName);
}