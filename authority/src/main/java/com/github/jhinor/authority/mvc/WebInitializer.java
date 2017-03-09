package com.github.jhinor.authority.mvc;

import com.github.jhinor.authority.InfrastructureConf;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import java.util.EnumSet;

/**
 * @author shiyu.long
 */
public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        //bind spring context
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(InfrastructureConf.class);
        ctx.setServletContext(servletContext);
        //add spring web mvc dispatcher servlet
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        dispatcher.addMapping("/");
        dispatcher.setLoadOnStartup(1);
        //authority filter
        DelegatingFilterProxy delegatingFilterProxy = new DelegatingFilterProxy();
        delegatingFilterProxy.setTargetFilterLifecycle(true);
        //post request encoding filter
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("utf-8");
        //add filter mapping
        FilterRegistration.Dynamic shiroFilter = servletContext.addFilter("shiroFilter", delegatingFilterProxy);
        shiroFilter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), false, "/*");
        FilterRegistration filterRegistration =
                servletContext.addFilter("characterEncodingFilter", characterEncodingFilter);
        filterRegistration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), false, "/*");

    }
}
