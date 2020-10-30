package com.masonluo.learn.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Masonluo
 * @date 2020-10-29 14:09
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String index(){
        return "Hello World";
    }
}
