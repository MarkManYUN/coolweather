package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 马云山 on 2017/10/7.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("cnty")
    public String cation;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}
