package org.example.Singelton.zadanie2;

import java.util.*;

class Database {
    private static Map<String, Database> instances = new HashMap<>();
    private List<Record> records; // Lista przechowująca rekordy
    private int nextId = 1;




    private Database() {
        this.records = new ArrayList<>();
    }

    public static Database getInstance(String key) {
        if(!instances.containsKey(key)) {
            instances.put(key, new Database());
        }

        return instances.get(key);
    }
    public DatabaseConnection getConnection() {
        return new DatabaseConnectionImpl();
    }

    // Zwraca implementację interfejsu DatabaseConnection
    // Prywatna klasa wewnętrzna implementująca interfejs DatabaseConnection
    // W Javie korzystamy z cech klas wewnętrznych, w C# ta klasa musiałaby posiadać
    // referencję na obiekt klasy Database
    private class DatabaseConnectionImpl implements DatabaseConnection {
        // Dodawanie nowego rekordu
        @Override
        public int addRecord(String name, int age) {
            Record newRecord = new Record(nextId++, name, age);
            records.add(newRecord);
            System.out.println("Inserted: " + newRecord);
            return nextId - 1; // zwracamy id dodanego rekordu
        }

        // Pobieranie rekordu po ID
        @Override
        public Optional<Record> getRecord(int id) {
            return records.stream().filter(record -> record.getId() == id).findFirst();
        }

        // Aktualizowanie rekordu po ID
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


        // Usuwanie rekordu po ID
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


        // Wyświetlanie wszystkich rekordów
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
