package com.annotation.sample.interceptor;

import com.annotation.sample.annotation.RWSwitch;
import com.annotation.sample.datasource.DynamicDataSourceHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liys on 2018/9/17.
 */
public class AnnotationInterceptor implements HandlerInterceptor {
    DynamicDataSourceHolder dynamicDataSourceHolder ;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        RWSwitch annotation = handlerMethod.getMethodAnnotation(RWSwitch.class);
        if(annotation==null){
            return true;
        }
        //如果当前数据源与注解不符，切换数据源
        dynamicDataSourceHolder.exchangeKey(annotation.source());
        System.out.println("method = "+handlerMethod.getMethod().getName()+"     key = "+annotation.source().key()+"          ds = "+DynamicDataSourceHolder.getRouteKey().key() );
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
