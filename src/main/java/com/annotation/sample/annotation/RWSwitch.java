package com.annotation.sample.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liys on 2018/9/17.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RWSwitch {
    DataSourceRouteKey  source() default DataSourceRouteKey.READWIRTE;
}
