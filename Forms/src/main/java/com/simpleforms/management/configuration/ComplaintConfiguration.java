package com.simpleforms.management.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.simpleforms.management")
public class ComplaintConfiguration {
    public ComplaintConfiguration(){
        System.out.println("Running the ComplaintConfiguration const");
    }
}
