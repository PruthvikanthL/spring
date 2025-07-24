package com.simpleforms.management.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.simpleforms.management")
public class TutionConfiguration {
    public TutionConfiguration(){
        System.out.println("Running the TutionConfiguration const");
    }
}
