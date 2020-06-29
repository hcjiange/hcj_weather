package cn.jjwwai.www.hcj_weather.db;

import org.litepal.crud.DataSupport;

/**
 * @author: 黄成江
 * Created by jiange on 2020/6/27.
 */

public class County extends DataSupport {//县数据信息
    private int id;//县编号
    private String countyName;//县名称
    private String weatherId;//县天气的id
    private int cityId;//当前县所属城市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
