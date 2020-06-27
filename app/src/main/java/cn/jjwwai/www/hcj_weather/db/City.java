package cn.jjwwai.www.hcj_weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by jiange on 2020/6/27.
 */

public class City extends DataSupport {//市数据信息
    private int id;//城市编号
    private String cityName;//城市名称
    private int cityCode;//城市代号
    private int provinceId;//当前城市所属省的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

}
