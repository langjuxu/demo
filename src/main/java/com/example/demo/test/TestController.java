package com.example.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengqian
 * @date 2018/5/7
 */
@RestController
public class TestController {

    @RequestMapping(value = "/getTest",method = RequestMethod.GET)
    public String getTest(){
        System.err.println("hahhahahhahah");
        return "gagagga";
    }

}
