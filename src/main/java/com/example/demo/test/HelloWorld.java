package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fengqian
 * @date 2018/5/10
 */
@Controller
public class HelloWorld {

    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String toLogin() {
        System.err.println("tologin");
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestParam(value = "username") String username, @RequestParam(value = "pwd") String pwd) {
        System.err.println(username+pwd);
        return "success";
    }


}
