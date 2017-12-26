package com.example.coolweather.gson;

/**
 * Created by VULCAN on 2017/12/26.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
