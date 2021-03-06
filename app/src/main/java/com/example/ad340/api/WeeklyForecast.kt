package com.example.ad340.api

import com.squareup.moshi.Json


data class Temp(val min: Float, val max: Float)

data class DailyForecast(
    @field:Json(name = "dt")
    val date: Long,
    val temp: Temp,
    val weather: List<WeatherDescription>
)
/**
 * Api response for seven day forecast from OpenWeatherMap's /onecall endpoint
 */
data class WeeklyForecast(val daily: List<DailyForecast>)