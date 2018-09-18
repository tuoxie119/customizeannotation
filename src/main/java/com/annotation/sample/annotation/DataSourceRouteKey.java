package com.annotation.sample.annotation;

/**
 * Created by liys on 2018/9/18.
 */
public enum DataSourceRouteKey {
    READONLY("readonly"),
    READWIRTE("readwrite");

    private String key;

    DataSourceRouteKey(String key){
        this.key = key;
    }

    public String key() {
        return key;
    }
}
