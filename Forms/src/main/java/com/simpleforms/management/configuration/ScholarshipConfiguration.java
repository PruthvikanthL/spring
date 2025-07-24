package com.simpleforms.management.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.simpleforms.management")
public class ScholarshipConfiguration {
    public ScholarshipConfiguration(){
        System.out.println("Running the ScholarshipConfiguration Const");
    }
}
