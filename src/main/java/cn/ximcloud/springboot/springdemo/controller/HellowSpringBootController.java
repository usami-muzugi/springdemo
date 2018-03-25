package cn.ximcloud.springboot.springdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
@RequestMapping(value="hello",method = RequestMethod.GET)
public class HellowSpringBootController {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String say() {
        return "Hello,Spring Boot!";
//        return "index";
    }
}

