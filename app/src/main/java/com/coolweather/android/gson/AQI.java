package com.coolweather.android.gson;

/**
 * Created by 马云山 on 2017/10/7.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
