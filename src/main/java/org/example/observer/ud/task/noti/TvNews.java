package org.example.observer.ud.task.noti;

import org.example.observer.ud.task.ob.WeatherForecast;
import org.example.observer.ud.task.ob.Observer;

public class TvNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody: temperatura:" + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure());
    }
}
