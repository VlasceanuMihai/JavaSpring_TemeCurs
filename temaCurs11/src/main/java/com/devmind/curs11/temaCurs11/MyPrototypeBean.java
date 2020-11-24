package com.devmind.curs11.temaCurs11;

import org.springframework.beans.factory.annotation.Value;

/**
 * Project: temaCurs11
 * Author: mihai
 * Date: 11/24/2020
 */
public class MyPrototypeBean {

    @Value("${}")
    private String name;
}
