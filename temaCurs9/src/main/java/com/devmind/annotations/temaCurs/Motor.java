package com.devmind.annotations.temaCurs;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Project: Homework
 * Author: mihai
 * Date: 11/18/2020
 */

@Data
public class Motor {

    private int power;
    private String name;
    private int numberOfCylinders;

    @Autowired
    public Motor(int power, String name, int numberOfCylinders) {
        this.power = power;
        this.name = name;
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "power=" + power +
                ", name='" + name + '\'' +
                ", numberOfCylinders=" + numberOfCylinders +
                '}';
    }
}
