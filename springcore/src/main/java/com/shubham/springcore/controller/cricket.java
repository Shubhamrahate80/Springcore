package com.shubham.springcore.controller;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component



//@Primary
public class cricket implements coach {

    cricket(){
        System.out.println("cricket constructor");
    }

    @Override
    public String getdailyworkout() {
        return "practice daily for batting";
    }
}
