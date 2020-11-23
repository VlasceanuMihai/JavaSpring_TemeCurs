package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Project: Curs3
 * Author: mihai
 * Date: 11/15/2020
 */

@Configuration
@ComponentScan("com")
@PropertySource("classpath:properties.properties")
public class Config {

    @Bean
    public Dog dog(@Value("${dog.name}") String name, @Value("${dog.age}") int age) {
        return new Dog(name, age);
    }

    @Bean
    public Cat cat(@Value("${cat.name}") String name, @Value("${cat.age}") int age) {
        return new Cat(name, age);
    }

    @Bean
    public Mouse mouse(@Value("${mouse.name}") String name) {
        return new Mouse(name);
    }
}
