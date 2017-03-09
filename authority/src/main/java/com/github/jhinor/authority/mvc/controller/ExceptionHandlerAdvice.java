package com.github.jhinor.authority.mvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author shiyu.long
 */
@ControllerAdvice("com.github.jhinor.shiro.mvc.controller")
public class ExceptionHandlerAdvice {
    @ExceptionHandler(Exception.class)
    public void exceptionHandler(Exception e) {
        System.out.println("ExceptionHandlerAdvice.exceptionHandler");
        System.out.println(e.getMessage());
    }
}
