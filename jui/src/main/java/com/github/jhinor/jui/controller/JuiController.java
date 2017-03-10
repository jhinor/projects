package com.github.jhinor.jui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shiyu.long
 */
@Controller
public class JuiController {
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main() {
        return "/main";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/index";
    }

    @RequestMapping(value = "/sign-in", method = RequestMethod.GET)
    public String signIn(Model model) {
        model.addAttribute("copyright", "jhinor © jhinor.github.com");
        return "/sign-in";
    }
}
