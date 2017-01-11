package com.seasual.observer;

public class Geek implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather) {
            case COLD:
                System.out.println("The geek like to play computer game in the cold day.");
                break;
            case RAINY:
                System.out.println("The geek like to play computer game in the rainy day.");
                break;
            case SUNNY:
                System.out.println("The geek like to play computer game in the sunny day.");
                break;
            case WINDY:
                System.out.println("The geek like to play computer game in the windy day.");
                break;
            default:
                break;
        }
    }
}
