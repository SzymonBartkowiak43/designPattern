package org.example.reszta.observer;

import org.example.reszta.observer.notification.Email;
import org.example.reszta.observer.notification.MobileApp;
import org.example.reszta.observer.notification.TextMessage;
import org.example.reszta.observer.order.Order;
import org.example.reszta.observer.order.OrderStatus;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();


        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);


        order.notifyObserver();


        System.out.println("");
        order.changeOrderStatus(OrderStatus.WYSLANE);


    }

}
