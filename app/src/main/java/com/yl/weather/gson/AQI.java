package com.yl.weather.gson;

/**
 * Gson数据AQI
 * Created by Luke on 2017/9/6.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
        public String co;
        public String no2;
        public String pm10;
        public String qlty;
        public String so2;
        public String o3;

        @Override
        public String toString() {
            return "AQICity{" +
                    "aqi='" + aqi + '\'' +
                    ", pm25='" + pm25 + '\'' +
                    ", co='" + co + '\'' +
                    ", no2='" + no2 + '\'' +
                    ", pm10='" + pm10 + '\'' +
                    ", qlty='" + qlty + '\'' +
                    ", so2='" + so2 + '\'' +
                    ", o3='" + o3 + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AQI{" +
                "city=" + city.toString() +
                '}';
    }
}
