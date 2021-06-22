package com.example.weatherdemo.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class WeatherInfoDTO implements Serializable {

    private String city;
    private String temperature;
    private String pressure;
    private boolean raining;
}
