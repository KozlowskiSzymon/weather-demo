package com.example.weatherdemo.service;

import com.example.weatherdemo.model.WeatherInfoDTO;

public interface WeatherService {

    public WeatherInfoDTO getWeatherByLocation(String city);
}
