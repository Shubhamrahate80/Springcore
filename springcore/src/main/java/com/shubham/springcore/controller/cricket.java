package com.shubham.springcore.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class cricket implements coach {


    @Override
    public String getdailyworkout() {
        return "practice daily for batting";
    }
}
