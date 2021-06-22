package com.example.weatherdemo.service;

import com.example.weatherdemo.helper.NumberHelper;
import com.example.weatherdemo.model.WeatherInfoDTO;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService{

    @Override
    public WeatherInfoDTO getWeatherByLocation(String city) {
        return WeatherInfoDTO.builder()
                .city(city)
                .temperature(NumberHelper.getRandomIntegerBetweenRange(-5, 25) + " C")
                .pressure(NumberHelper.getRandomIntegerBetweenRange(990, 1150) + " hPa")
                .raining(true)
                .build();
    }
}
