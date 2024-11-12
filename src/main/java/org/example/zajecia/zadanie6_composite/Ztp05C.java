package org.example.zajecia.zadanie6_composite;

import java.time.LocalDate;


public class Ztp05C {
    public static void main(String[] args) {
        Task task1 = new Task("1A - Implementacja algorytmu sortowania", LocalDate.of(2024, 10, 21), LocalDate.of(2024, 10, 27));
        Task task2 = new Task("1B - Analiza złożoności czasowej", LocalDate.of(2024, 10, 24), LocalDate.of(2024, 10, 31));
        Task task3 = new Task("2A - Projektowanie schematu bazy danych", LocalDate.of(2024, 10, 28), LocalDate.of(2024, 11, 3));
        Task task4 = new Task("2B - Tworzenie zapytań SQL", LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 30));

        NormalTaskGroup group1 = new NormalTaskGroup("Grupa 1 - Algorytmy");
        group1.addTask(task1);
        group1.addTask(task2);

        NormalTaskGroup group2 = new NormalTaskGroup("Grupa 2 - Bazy danych");
        group2.addTask(task3);
        group2.addTask(task4);

        NormalTaskGroup mainGroup = new NormalTaskGroup("Projekt");
        mainGroup.addTask(group1);
        mainGroup.addTask(group2);

        task1.markAsCompleted(LocalDate.of(2024, 10, 25));
        task2.markAsCompleted(LocalDate.of(2024, 11, 1));

        System.out.println("Struktura zadań:");
        mainGroup.display("");


        System.out.println("\nPodsumowanie zadań:");
        System.out.println("Zadania wykonane na czas: " + group1.getCompletedOnTime());
        System.out.println("Zadania wykonane z opóźnieniem: " + group1.getCompletedLate());
        System.out.println("Zadania oczekujące: " + group1.getPending());
        System.out.println("Zadania oczekujące z przekroczonym terminem: " + group1.getPendingLate());


        Task task5 = new Task("3A - Implementacja algorytmu sortowania", LocalDate.of(2024, 10, 21), LocalDate.of(2024, 10, 27));
        Task task6 = new Task("3B - Analiza złożoności czasowej", LocalDate.of(2024, 10, 24), LocalDate.of(2024, 10, 31));

        OptionalTaskGroup optionalTaskGroup = new OptionalTaskGroup("Grupa Optional");
        optionalTaskGroup.addTask(task5);
        optionalTaskGroup.addTask(task6);

        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");


        optionalTaskGroup.markAsCompleted(LocalDate.of(2024, 11, 1));

        optionalTaskGroup.display("");

        System.out.println("Jest wykonane: " + optionalTaskGroup.isCompleted());




    }
}
