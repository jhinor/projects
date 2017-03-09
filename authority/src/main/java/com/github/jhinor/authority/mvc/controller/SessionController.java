package com.github.jhinor.authority.mvc.controller;

import com.github.jhinor.authority.util.CONSTANT;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shiyu.long
 */
@Controller
@RequestMapping("/sessions")
public class SessionController {
    @RequestMapping(method = RequestMethod.POST)
    public String createSession(String username, String password) {
        Subject subject = SecurityUtils.getSubject();
        subject.login(new UsernamePasswordToken(username, password));
        return CONSTANT.PATH.INDEX;
    }
}
