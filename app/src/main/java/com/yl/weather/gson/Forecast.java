package com.yl.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Gson数据Forecast
 * Created by Luke on 2017/9/6.
 */

public class Forecast {

    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
