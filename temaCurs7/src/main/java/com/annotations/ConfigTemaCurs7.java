package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Project: TemaCurs7
 * Author: mihai
 * Date: 11/15/2020
 */

@Configuration
@ComponentScan("com.annotations")
public class ConfigTemaCurs7 {

    @Bean
    public WebDevTeacher webDevTeacher(){
        return new WebDevTeacher("webDevTeacher description");
    }
}
