package com.javagirl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: springbootDemo1
 * @description: 页面跳转
 * @author: 严玉梅
 * @create: 2019-09-26 14:22
 **/
@Controller
public class HelloController2 {
    @GetMapping("/hello2")
    public String hello(){
        return "hello2";
    }
}
