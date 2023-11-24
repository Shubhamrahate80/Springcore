package com.shubham.springcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {

    @Qualifier("cricket")
    //field injection-this is not recommaded
    @Autowired
    coach thecoach;

    @Autowired
    //constructor injection
//    public homecontroller(@Qualifier("cricket")coach thecoach){
//        this.thecoach=thecoach;
//    }

    //Setter injection
    public void setTheCoach(@Qualifier("cricket")coach thecoach) {
        this.thecoach = thecoach;
    }

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
