package com.devmind.annotations.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Project: Curs9
 * Author: mihai
 * Date: 11/16/2020
 */

@Configuration
@ComponentScan("com.devmind.annotations.springapp")
public class ConfigCurs9 {

    @Bean
    public TestBeanAnnotation testBeanAnnotation(){
        return new TestBeanAnnotation("test", 100);
    }
}
