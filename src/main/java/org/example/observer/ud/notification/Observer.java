package org.example.observer.ud.notification;

import org.example.observer.ud.order.Order;

public interface Observer {

    void update(Order order);
}
