package com.icecream.management.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.icecream.management")
public class IceCreamCofiguration {
    public IceCreamCofiguration(){
        System.out.println("IceCreamCofiguration const is Running");

    }
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver view=new InternalResourceViewResolver();
        view.setPrefix("/WEB-INF/views/");
        view.setSuffix(".jsp");
        return view;
    }
}
