package com.test.demo.controller;

import com.test.demo.domain.UserInfo;
import org.springframework.security.cas.authentication.CasAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author yunzhang
 * @email yzyunzhang@foxmail.com
 * @date 2025/8/4
 * @description
 */
@Controller
public class ClientController {

    @RequestMapping("/")
    public String index() {
        return "home";
    }

    @RequestMapping("/me")
    public ModelAndView about_me(CasAuthenticationToken principal) {
        ModelAndView modelAndView = new ModelAndView("cas");
        modelAndView.addObject("username", principal.getName());
        modelAndView.addObject("attributes",((UserInfo)principal.getUserDetails()).getAttributes());
        return modelAndView;
    }

}
