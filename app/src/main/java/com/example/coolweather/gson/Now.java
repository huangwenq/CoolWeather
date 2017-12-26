package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by VULCAN on 2017/12/26.
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
