package com.shubham.springcore.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class football implements coach {

    @Override
    public String getdailyworkout(){
        return "just daily continously running";
    }
}
