package org.example.reszta.observer.order;

import org.example.reszta.observer.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObserver();
}
