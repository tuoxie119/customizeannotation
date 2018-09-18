package com.annotation.sample.datasource;

import com.annotation.sample.annotation.DataSourceRouteKey;

/**
 * Created by liys on 2018/9/18.
 */

public class DynamicDataSourceHolder {
    private static ThreadLocal<DataSourceRouteKey> routeKey = new ThreadLocal<DataSourceRouteKey>();

    public static DataSourceRouteKey getRouteKey(){
        DataSourceRouteKey key = routeKey.get();
        return key;
    }

    public static void  setRouteKey(DataSourceRouteKey key)    {
        routeKey.set(key);
    }

    public static void removeRouteKey() {
        routeKey.remove();
    }
    public static void exchangeKey(DataSourceRouteKey dataSourceRouteKey){
        if(dataSourceRouteKey.equals(getRouteKey())){
            return;
        }else {
            System.out.println("exchange datasource to "+dataSourceRouteKey.key());
            setRouteKey(dataSourceRouteKey);
        }
    }
}
