package com.annotation.sample.config;

import com.annotation.sample.interceptor.AnnotationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by liys on 2018/9/17.
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    @Bean
    public AnnotationInterceptor annotationInterceptor(){return new AnnotationInterceptor();}

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(annotationInterceptor());
    }
}
