package org.example.observer.ud.order;

import lombok.Getter;
import lombok.Setter;
import org.example.observer.ud.notification.Observer;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Order implements Observable {
    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObservers = new HashSet<Observer>();


    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: registeredObservers) {
            observer.update(this);
        }
    }

    public void changeOrderStatus(OrderStatus orderStatus) {
        setOrderStatus(orderStatus);
        notifyObserver();
    }


}
