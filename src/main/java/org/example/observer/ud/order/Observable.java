package org.example.observer.ud.order;

import org.example.observer.ud.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObserver();
}
