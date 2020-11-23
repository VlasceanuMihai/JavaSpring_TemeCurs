package com.devmind.annotations.temaCurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Project: Homework
 * Author: mihai
 * Date: 11/17/2020
 */

@Component
public class Motorcycle implements IAutomobil{

    private int maxDrivingSpeed = 300;

    @Autowired
    private Motor motor;

    @Override
    public String travel() {
        return "[Motorcycle trip] Travel to Cluj-Napoca with motorcycle";
    }

    @Override
    public int maxDrivingSpeed() {
        return this.maxDrivingSpeed;
    }

    public void motorToString(){
        System.out.println(this.motor.toString());
    }
}
