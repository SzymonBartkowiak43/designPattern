package org.example.reszta.observer.task.noti;

import org.example.reszta.observer.task.ob.WeatherForecast;
import org.example.reszta.observer.task.ob.Observer;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura:" + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure());
    }
}