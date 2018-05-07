package com.xzdr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("/zz")
    public String index(Map<String, Object> model){
        model.put("name", "zzz");
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "this is a test";
    }
}
