package com.javagirl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springbootDemo1
 * @description: 测试
 * @author: 严玉梅
 * @create: 2019-09-25 16:10
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
