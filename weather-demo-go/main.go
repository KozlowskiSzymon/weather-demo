package main

import (
    "fmt"
    "log"
    "net/http"
    "math/rand"
    "encoding/json"
    "strconv"
)


type WeatherInfoDTO struct {
    City string `json:"City"`
    Temperature string `json:"Temperature"`
    Pressure string `json:"Pressure"`
    Raining bool `json:"Raining"`
}

var WeatherInfo WeatherInfoDTO

func homePage(w http.ResponseWriter, r *http.Request){

    fmt.Println("Weather checked.")

    cities, ok := r.URL.Query()["city"]
    
    if !ok || len(cities[0]) < 1 {
        log.Println("Url Param 'city' is missing")
        return
    }

    city := cities[0]

    WeatherInfo = WeatherInfoDTO{City: city, Temperature: strconv.Itoa(rand.Intn(40) - 10)+" C", Pressure: strconv.Itoa(rand.Intn(220) + 900)+" hPa", Raining: false}

    json.NewEncoder(w).Encode(WeatherInfo)
}

func handleRequests() {
    http.HandleFunc("/api/weather/location", homePage)
    log.Fatal(http.ListenAndServe(":8090", nil))
}

func main() {
    fmt.Println("Start")
    handleRequests()
}
