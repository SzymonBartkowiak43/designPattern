package org.example.reszta.observer.notification;

import org.example.reszta.observer.order.Order;

public class TextMessage  implements Observer{
    public void update(Order order) {
        System.out.println("SMS - Zamkowenie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
