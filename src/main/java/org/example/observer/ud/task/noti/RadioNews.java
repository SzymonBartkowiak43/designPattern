package org.example.observer.ud.task.noti;

import org.example.observer.ud.task.ob.WeatherForecast;
import org.example.observer.ud.task.ob.Observer;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura:" + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure());
    }
}
