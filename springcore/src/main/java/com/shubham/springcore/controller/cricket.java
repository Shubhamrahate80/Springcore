package com.shubham.springcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.text.CollationElementIterator;


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
