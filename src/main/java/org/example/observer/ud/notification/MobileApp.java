package org.example.observer.ud.notification;

import org.example.observer.ud.order.Order;



public class MobileApp implements Observer {
    public void update(Order order) {
        System.out.println("Aplikacja mobilna Zamkowenie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
