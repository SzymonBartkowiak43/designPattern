package org.example.observer.ud;

import org.example.observer.ud.notification.Email;
import org.example.observer.ud.notification.MobileApp;
import org.example.observer.ud.notification.TextMessage;
import org.example.observer.ud.order.Order;
import org.example.observer.ud.order.OrderStatus;

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
