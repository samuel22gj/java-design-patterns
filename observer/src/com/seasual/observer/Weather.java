package com.seasual.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Weather can be observed by implementing {@link WeatherObserver} interface and registering as listener.
 */
public class Weather {

    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public Weather() {
        currentWeather = WeatherType.SUNNY;
        observers = new ArrayList<>();
    }

    public void addObserver(WeatherObserver observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    public void removeObserver(WeatherObserver observer) {
        if (observer != null) {
            observers.remove(observer);
        }
    }

    public void clearObserver() {
        observers.clear();
    }

    public void timePasses() {
        WeatherType[] enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println("== The weather change to " + currentWeather.toString() + " ==");

        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(currentWeather);
        }

        // In java 8.
//        observers.forEach(observer -> observer.update(currentWeather));
    }
}
