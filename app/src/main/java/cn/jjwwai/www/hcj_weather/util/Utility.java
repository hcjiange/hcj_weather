package cn.jjwwai.www.hcj_weather.util;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cn.jjwwai.www.hcj_weather.db.City;
import cn.jjwwai.www.hcj_weather.db.County;
import cn.jjwwai.www.hcj_weather.db.Province;

/**
 * Created by jiange on 2020/6/27.
 */

public class Utility {
    /**
     * 解析处理服务器返回的省级数据
     * @param response
     * @return
     */
    public static boolean handleProvinceResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0;i < allProvinces.length(); i++){
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.setProvinceName(provinceObject.getString("name"));
                    province.save();
                    return true;
                }
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析处理服务器返回的市级数据
     * @param response
     * @return
     */
    public static boolean handleCityResponse(String response,int provinceId){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allCity = new JSONArray(response);
                for (int i = 0;i < allCity.length(); i++){
                    JSONObject cityObject = allCity.getJSONObject(i);
                    City city = new City();
                    city.setCityCode(cityObject.getInt("id"));
                    city.setCityName(cityObject.getString("name"));
                    city.setProvinceId(provinceId);
                    city.save();
                    return true;
                }
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析处理服务器返回的县级数据
     * @param response
     * @return
     */
    public static boolean handleCountyResponse(String response,int cityId){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allCounty = new JSONArray(response);
                for (int i = 0;i < allCounty.length(); i++){
                    JSONObject countyObject = allCounty.getJSONObject(i);
                    County county = new County();
                    county.setWeatherId(countyObject.getInt("weather_id"));
                    county.setCountyName(countyObject.getString("name"));
                    county.setCityId(cityId);
                    county.save();
                    return true;
                }
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
}
