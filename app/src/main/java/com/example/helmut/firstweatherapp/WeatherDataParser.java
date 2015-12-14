package com.example.helmut.firstweatherapp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {
    public static double getMaxTempForDay (String jsonStr, int dayIndex) throws JSONException {

        JSONObject weather = new JSONObject(jsonStr);
        JSONArray days =  weather.getJSONArray("list");
        JSONObject dayInfo = days.getJSONObject(dayIndex);
        JSONObject temperatureInfo = dayInfo.getJSONObject("temp");

        return temperatureInfo.getDouble("max");

    }

}
