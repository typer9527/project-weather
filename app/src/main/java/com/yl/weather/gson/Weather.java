package com.yl.weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Gson数据Weather
 * Created by Luke on 2017/9/6.
 */

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    @Override
    public String toString() {
        return "Weather{" +
                "basic=" + basic.toString() +
                ", aqi=" + aqi.toString() +
                '}';
    }
}
