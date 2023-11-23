package com.shubham.springcore.controller;

import org.springframework.stereotype.Component;


@Component
public class cricket implements coach {


    @Override
    public String getdailyworkout() {
        return "practice daily for batting";
    }
}
