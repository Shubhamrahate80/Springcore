package com.shubham.springcore.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class football implements coach {

    football(){
        System.out.println("constructor football");
    }
    @Override
    public String getdailyworkout(){
        return "just daily continously running";
    }
}
