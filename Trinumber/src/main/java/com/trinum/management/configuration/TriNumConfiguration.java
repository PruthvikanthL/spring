package com.trinum.management.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.trinum.management")
public class TriNumConfiguration {
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver view=new InternalResourceViewResolver();
        view.setPrefix("/WEB-INF/Views/");
        view.setSuffix(".jsp");
        return view;
    }
}
