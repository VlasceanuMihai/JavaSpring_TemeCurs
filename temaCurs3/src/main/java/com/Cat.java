package com;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Project: Curs3
 * Author: mihai
 * Date: 10/28/2020
 */

@Data
@Component
public class Cat implements IAnimal {

    private String name;
    private int age;

    @Autowired
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String makeSound() {
        return "Cat sounds...";
    }
}
