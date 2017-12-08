package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/12/8.
 */

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int proivnceCode;

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

    public int getProivnceCode() {
        return proivnceCode;
    }

    public void setProivnceCode(int proivnceCode) {
        this.proivnceCode = proivnceCode;
    }




}
