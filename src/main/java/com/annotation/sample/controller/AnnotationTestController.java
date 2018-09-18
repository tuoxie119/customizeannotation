package com.annotation.sample.controller;

import com.annotation.sample.annotation.DataSourceRouteKey;
import com.annotation.sample.annotation.RWSwitch;
import com.annotation.sample.datasource.DynamicDataSourceHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liys on 2018/9/17.
 */
@RestController
public class AnnotationTestController {


    @RequestMapping("/read")
    @RWSwitch(source = DataSourceRouteKey.READONLY)
    public String test01(){
        System.out.println("test01 使用的数据源为： " + DynamicDataSourceHolder.getRouteKey());
        return "";
    }

    @RWSwitch
    @RequestMapping("/write")
    public String test02(){
        System.out.println("test02 使用的数据源为： " + DynamicDataSourceHolder.getRouteKey());
        return "";
    }

    @RWSwitch(source = DataSourceRouteKey.READWIRTE)
    @RequestMapping("/readWrite")
    public String test03(){
        System.out.println("test03 使用的数据源为： " + DynamicDataSourceHolder.getRouteKey());
        return "";
    }
}
