package org.example.Singelton.zadanie2;

import java.util.Optional;

public class DatabaseConnectionImpl implements DatabaseConnection {
    @Override
    public int addRecord(String name, int age) {
        return 0;
    }

    @Override
    public void updateRecord(int id, String newName, int newAge) {

    }

    @Override
    public void deleteRecord(int id) {

    }

    @Override
    public Optional<Record> getRecord(int id) {
        return Optional.empty();
    }

    @Override
    public void showAllRecords() {

    }
}
