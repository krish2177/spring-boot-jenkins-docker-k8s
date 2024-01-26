package com.vkr.springbootjenkinsdockerk8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/greetings")
    public String getGreetings(){
        return "Welcome to Our Website...";
    }

    @GetMapping("/msg")
    public String getMsg(){
        return "Good Morning Krishna Reddy...";
    }
}
