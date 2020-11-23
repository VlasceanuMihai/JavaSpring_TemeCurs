package com.devmind.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Project: TemaCurs5
 * Author: mihai
 * Date: 11/22/2020
 */

@Configuration
@ComponentScan("com")
public class Config {

    @Bean
    public Task theTaskBean(){
        return new Task();
    }
}
