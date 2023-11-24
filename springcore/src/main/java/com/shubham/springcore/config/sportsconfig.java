package com.shubham.springcore.config;

import com.shubham.springcore.controller.coach;
import com.shubham.springcore.controller.swim;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class sportsconfig {
    @Bean
    coach Swimcoach(){
        return new swim();
    }
}
