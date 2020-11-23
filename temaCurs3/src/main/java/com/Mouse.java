package com;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Project: Curs3
 * Author: mihai
 * Date: 10/28/2020
 */

@Data
//@Component
public class Mouse implements IAnimal {

    private String name;
    private int age;

    @Autowired
    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public String makeSound() {
        return "Mouse sounds...";
    }
}
