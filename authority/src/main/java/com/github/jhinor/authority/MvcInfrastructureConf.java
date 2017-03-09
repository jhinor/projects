package com.github.jhinor.authority;

import com.github.jhinor.authority.mvc.interceptor.AuthInterceptor;
import com.github.jhinor.authority.util.CONSTANT;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author shiyu.long
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.github.jhinor.authority.mvc.controller", includeFilters = @ComponentScan.Filter(Controller.class))
public class MvcInfrastructureConf extends WebMvcConfigurerAdapter {
    @Bean
    public MultipartResolver multipartResolver() {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setMaxUploadSize(CONSTANT.MVC.MAX_UPLOAD_SIZE);
        return commonsMultipartResolver;
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix(CONSTANT.MVC.RESOLVER_PREFIX);
        internalResourceViewResolver.setSuffix(CONSTANT.MVC.RESOLVER_SUFFIX);
        internalResourceViewResolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
        registry.viewResolver(internalResourceViewResolver);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor());
    }


    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController(CONSTANT.PATH.LOGIN).setViewName(CONSTANT.PATH.LOGIN);
        registry.addViewController(CONSTANT.PATH.SIGN_IN).setViewName(CONSTANT.PATH.SIGN_IN);

    }
}
