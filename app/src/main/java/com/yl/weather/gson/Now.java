package com.yl.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Gson数据Now
 * Created by Luke on 2017/9/6.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
