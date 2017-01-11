package com.seasual.observer;

/**
 * Observer interface.
 */
public interface WeatherObserver {

    void update(WeatherType currentWeather);
}
