package com.project.one.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller1 {

    @GetMapping("/")
    public String WelcomeMessage(){
//        System.out.println("Welcome to spring boot");
        return "Welcome to Spring boot";
    }
}
