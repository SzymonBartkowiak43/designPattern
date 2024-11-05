package org.example.reszta.observer.notification;

import org.example.reszta.observer.order.Order;

public interface Observer {

    void update(Order order);
}
