package com.shubham.springcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {

    @Autowired
    coach thecoach;
        @GetMapping("/hello")
            public String sayhello() {
            return "hey bro";
        }
    @GetMapping("/cricket")
    public String cricket(){
        return thecoach.getdailyworkout();

    }
}
