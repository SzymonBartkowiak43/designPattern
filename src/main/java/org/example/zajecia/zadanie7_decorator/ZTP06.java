package org.example.zajecia.zadanie7_decorator;

import java.util.Scanner;

public class ZTP06 {
    public static void main(String[] args) {
        MessageBox messageBox = new MessageBox();

        // Dodanie przykładowych wiadomości
        messageBox.addMessage(new Message("Powiadomienie o spotkaniu", "Spotkanie zespołu odbędzie się w piątek o godzinie 10:00."));
        messageBox.addMessage(new Message("Nowe zasady pracy zdalnej", "Od przyszłego miesiąca obowiązują nowe zasady pracy zdalnej."));
        messageBox.addMessage(new Message("Wyniki kwartalne", "Wyniki finansowe za ostatni kwartał pokazują wzrost o 15%."));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Wyświetlenie listy tytułów wiadomości
            messageBox.displayAllMessageTitles();

            System.out.println("\nWybierz ID wiadomości do wyświetlenia (lub 0, aby zakończyć): ");
            int id = scanner.nextInt();

            if (id == 0) {
                running = false;
                System.out.println("Koniec programu.");
            } else {
                Message message = messageBox.getMessageById(id);
                if (message != null) {
                    System.out.println("\nTytuł: " + message.getTitle());
                    System.out.println("Treść: " + message.getContent());
                } else {
                    System.out.println("Nie znaleziono wiadomości o podanym ID.");
                }
            }
        }
        scanner.close();
    }
}