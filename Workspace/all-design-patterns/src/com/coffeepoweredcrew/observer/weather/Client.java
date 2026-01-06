package com.coffeepoweredcrew.observer.weather;

public class Client {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        Observer mobileObserver = new MobileDisplay();
        Observer webObserver = new WebDisplay();

        weatherStation.registerObserver(mobileObserver);
        weatherStation.registerObserver(webObserver);

        weatherStation.setTemperature(25.0f);

        weatherStation.removeObserver(mobileObserver);

        weatherStation.setTemperature(50.0f);
    }
}
