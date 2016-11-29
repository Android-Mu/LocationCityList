package com.example.mjj.locationcitylist.entity;

/**
 * 城市实体类
 */
public class CityEntity {

    public String name;
    public String pinyi;

    public CityEntity(String name, String pinyi) {
        super();
        this.name = name;
        this.pinyi = pinyi;
    }

    public CityEntity() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyi() {
        return pinyi;
    }

    public void setPinyi(String pinyi) {
        this.pinyi = pinyi;
    }

}
