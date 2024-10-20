package org.example.observer.ud.notification;

import org.example.observer.ud.order.Order;

public class TextMessage  implements Observer{
    public void update(Order order) {
        System.out.println("SMS - Zamkowenie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
