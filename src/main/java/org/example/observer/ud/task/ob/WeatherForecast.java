package org.example.observer.ud.task.ob;

import lombok.Getter;
import org.example.observer.ud.task.noti.InternetNews;
import org.example.observer.ud.task.noti.Observable;
import org.example.observer.ud.task.ob.Observer;

import java.util.HashSet;
import java.util.Set;

@Getter
public class WeatherForecast implements Observable {
    private int temperature;
    private int pressure;
    Set<Observer> registeredObservers = new HashSet<Observer>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
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
    public void notifyObservers() {
        for(Observer observer: registeredObservers) {
            observer.updateForecast(this);
        }
    }

    public void updateForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        for(Observer observer: registeredObservers) {
            if(observer instanceof InternetNews) {
                observer.updateForecast(this);
            }
        }

    }
}
