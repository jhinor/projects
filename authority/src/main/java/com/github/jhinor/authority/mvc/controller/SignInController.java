package com.github.jhinor.authority.mvc.controller;

import com.github.jhinor.authority.util.CONSTANT;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shiyu.long
 */
@Controller
@RequestMapping("/sign-in")
public class SignInController {
    @RequestMapping(method = RequestMethod.GET)
    public String signIn(Model model) {
        model.addAttribute("copyright", "jhinor © jhinor.github.com");
        return CONSTANT.PATH.SIGN_IN;
    }
}
