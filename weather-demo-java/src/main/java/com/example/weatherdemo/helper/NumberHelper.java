package com.example.weatherdemo.helper;

public class NumberHelper {

    public static double getRandomIntegerBetweenRange(double min, double max){
        return (int)(Math.random()*((max-min)+1))+min;
    }
}
