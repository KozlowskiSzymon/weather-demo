package com.example.weatherdemo.resource;

import com.example.weatherdemo.model.WeatherInfoDTO;
import com.example.weatherdemo.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/weather")
public class WeatherResource {

    private final WeatherService weatherService;

    @GetMapping("/location")
    public WeatherInfoDTO getWeatherByLocation(@RequestParam String city) {
        return weatherService.getWeatherByLocation("warsaw");
    }
}
