package com.devmind.annotations.temaCurs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Project: Homework
 * Author: mihai
 * Date: 11/18/2020
 */

@Configuration
@ComponentScan("com.devmind.annotations.temaCurs")
public class AutomobileConfig {

    @Bean
    public Motor motor(){
        return new Motor(2342, "schoolBus", 312);
    }
}
