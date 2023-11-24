package com.shubham.springcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {

    @Qualifier("cricket")
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
    @GetMapping("/football")
    public String football(){
            return "practise for shooting";
    }
}
