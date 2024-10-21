package org.example.observer.ud.task.noti;


import org.example.observer.ud.task.ob.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
