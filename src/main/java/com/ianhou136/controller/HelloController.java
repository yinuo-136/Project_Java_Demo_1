package com.ianhou136.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Hello(String[] args){
        System.out.println("Hello World");
        // return hello world string
        return "Hello World";
    }

    @RequestMapping("/simpleParam")
    public String simpleParam(String name, int age){
        System.out.println(name + age);
        return "OK" + name + age;
    }
}
