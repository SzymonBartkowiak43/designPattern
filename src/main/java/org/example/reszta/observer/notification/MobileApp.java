package org.example.reszta.observer.notification;

import org.example.reszta.observer.order.Order;



public class MobileApp implements Observer {
    public void update(Order order) {
        System.out.println("Aplikacja mobilna Zamkowenie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
