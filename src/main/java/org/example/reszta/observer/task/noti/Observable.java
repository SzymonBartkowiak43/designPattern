package org.example.reszta.observer.task.noti;


import org.example.reszta.observer.task.ob.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
