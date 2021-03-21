package com.victor.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    @RequestMapping("/fallback")
    public String fallback() {
        return "fallback";
    }

    @RequestMapping("/post")
    public String get() {
        return "post";
    }

}
