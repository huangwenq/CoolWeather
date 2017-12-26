package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by VULCAN on 2017/12/26.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
    public Suggestion suggestion;
}
