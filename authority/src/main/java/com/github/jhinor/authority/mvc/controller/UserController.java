package com.github.jhinor.authority.mvc.controller;

import com.github.jhinor.authority.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shiyu.long
 */
@Controller
@RequestMapping("/users")
public class UserController {
    @RequestMapping(method = RequestMethod.POST)
    public String add(User user) {
        return "";
    }
}
