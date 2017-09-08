package com.yl.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Gson数据basic
 * Created by Luke on 2017/9/6.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public String cnty;
    public String lat;
    public String lon;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
        public String utc;

        @Override
        public String toString() {
            return "Update{" +
                    "updateTime='" + updateTime + '\'' +
                    ", utc='" + utc + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Basic{" +
                "cityName='" + cityName + '\'' +
                ", weatherId='" + weatherId + '\'' +
                ", cnty='" + cnty + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", update=" + update.toString() +
                '}';
    }
}
