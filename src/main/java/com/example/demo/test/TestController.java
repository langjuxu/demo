package com.example.demo.test;

import org.springframework.web.bind.annotation.*;

/**
 * @author fengqian
 * @date 2018/5/9
 */
@RestController // 不能用来进行页面跳转，因为是@ResponseBody+@Controller,而@ResponseBody是返回json数据
public class TestController {

    @RequestMapping(value = "/getTest/{name}", method = RequestMethod.GET)
    public String getTest(@PathVariable String name) { //http://localhost:8081/getTest/feng
        System.err.println(name);
        return name + "feng";
    }

    @RequestMapping(value = "/getTest1/", method = RequestMethod.GET)
    public String getTest1(@RequestParam String name) { //http://localhost:8081/getTest1/?name=qian
        System.err.println(name);
        return name + "feng";
    }

    public static void main(String[] args) {
        System.err.println("为了验证一下提交后，Jenkins的反应。。。。。。");
    }

}
