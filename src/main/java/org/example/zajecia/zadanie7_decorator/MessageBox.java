package org.example.zajecia.zadanie7_decorator;

import java.util.ArrayList;
import java.util.List;

class MessageBox {
    private List<Message> messages = new ArrayList<>();
    private int nextId = 1;

    public void addMessage(Message message) {
        message.setId(nextId++);
        messages.add(message);
    }

    public Message getMessageById(int id) {
        for (Message message : messages) {
            if (message.getId() == id) {
                return message;
            }
        }
        return null;
    }

    public void displayAllMessageTitles() {
        System.out.println("\nLista wiadomości:");
        if (messages.isEmpty()) {
            System.out.println("Brak wiadomości w skrzynce.");
        } else {
            for (Message message : messages) {
                System.out.println("ID: " + message.getId() + " - " + message.getTitle());
            }
        }
    }
}
