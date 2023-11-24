package com.shubham.springcore.controller;

public class swim implements coach {

    public swim(){
        System.out.println("swim constructor");
    }

    @Override
    public String getdailyworkout() {
        return "daily swiming 100m for workout";
    }
}
