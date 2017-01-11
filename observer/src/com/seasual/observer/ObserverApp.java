package com.seasual.observer;

public class ObserverApp {

    public static void main(String[] args) {
        Weather weather = new Weather();
        Geek geek = new Geek();
        Hipster hipster = new Hipster();

        weather.addObserver(geek);
        weather.addObserver(hipster);

        weather.timePasses();
        weather.removeObserver(geek);
        weather.timePasses();
        weather.clearObserver();
        weather.timePasses();
    }
}
