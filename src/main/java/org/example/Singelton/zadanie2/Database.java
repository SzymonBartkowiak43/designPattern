package org.example.Singelton.zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Database {
    private List<Record> records;
    private int nextId = 1;

    public Database() {
        this.records = new ArrayList<>();
    }

    // Zwraca implementację interfejsu DatabaseConnection
    public DatabaseConnection getConnection() {
        return new DatabaseConnectionImpl();
    }

    // Prywatna klasa wewnętrzna implementująca interfejs DatabaseConnection
    // W Javie korzystamy z cech klas wewnętrznych, w C# ta klasa musiałaby posiadać
    // referencję na obiekt klasy Database
    private class DatabaseConnectionImpl implements DatabaseConnection {

        @Override
        public int addRecord(String name, int age) {
            Record newRecord = new Record(nextId++, name, age);
            records.add(newRecord);
            System.out.println("Inserted: " + newRecord);
            return nextId - 1;
        }

        @Override
        public Optional<Record> getRecord(int id) {
            return records.stream()
                    .filter(record -> record.getId() == id)
                    .findFirst();
        }

        @Override
        public void updateRecord(int id, String newName, int newAge) {
            Optional<Record> optionalRecord = getRecord(id);

            if (optionalRecord.isPresent()) {
                Record record = optionalRecord.get();
                record.setName(newName);
                record.setAge(newAge);
                System.out.println("Updated: " + record);
            } else {
                System.out.println("Record with ID " + id + " not found.");
            }
        }

        @Override
        public void deleteRecord(int id) {

            Optional<Record> optionalRecord = getRecord(id);

            if (optionalRecord.isPresent()) {
                records.remove(optionalRecord.get());
                System.out.println("Deleted record with ID " + id);
            } else {
                System.out.println("Record with ID " + id + " not found.");
            }
        }

        @Override
        public void showAllRecords() {
            if (records.isEmpty()) {
                System.out.println("No records in the database.");
            } else {
                System.out.println("All records:");
                records.forEach(System.out::println);
            }
        }
    }
}
