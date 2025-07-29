package com.testing.management.configuration;

import com.testing.management.control.SquareContoller;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SquareContoller.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
