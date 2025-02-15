package com.junit.advanced.testingtemperatureconverter;

public class Main {

    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = 77.0;

        System.out.println(celsius + "°C → " + TemperatureConverter.celsiusToFahrenheit(celsius) + "°F");
        System.out.println(fahrenheit + "°F → " + TemperatureConverter.fahrenheitToCelsius(fahrenheit) + "°C");
    }
}
