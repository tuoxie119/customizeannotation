//package com.annotation.sample.config;
//
//import com.annotation.sample.datasource.DynamicDataSourceHolder;
//import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
//import org.springframework.lang.Nullable;
//
///**
// * Created by liys on 2018/9/17.
// */
//public class DynamicDataSource extends AbstractRoutingDataSource {
//
//    @Nullable
//    @Override
//    protected Object determineCurrentLookupKey() {
//        return DynamicDataSourceHolder.getRouteKey();
//    }
//}
