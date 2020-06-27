package cn.jjwwai.www.hcj_weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by jiange on 2020/6/27.
 */

public class Province extends DataSupport {//省数据信息
    private int id;//省的编号
    private String provinceName;//省的名称
    private int provinceCode;//省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}
