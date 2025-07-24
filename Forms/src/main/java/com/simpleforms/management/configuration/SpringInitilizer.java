package com.simpleforms.management.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{JobConfiguration.class, GovernmentConfiguration.class, ComplaintConfiguration.class, MedicalConfiguration.class, ScholarshipConfiguration.class, TutionConfiguration.class};

    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/submit","/register","/complaint","/medicalhelp","/scholarshipapply","/tuitionrequest"};
    }
}
