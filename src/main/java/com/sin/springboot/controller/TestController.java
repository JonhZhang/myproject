package com.sin.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/helloworld")
    public String helloworld()

    {
        System.out.println("22222222222222");
        return "helloworld";
    }

}