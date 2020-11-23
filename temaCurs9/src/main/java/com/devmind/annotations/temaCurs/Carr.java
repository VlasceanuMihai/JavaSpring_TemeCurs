package com.devmind.annotations.temaCurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Project: Homework
 * Author: mihai
 * Date: 11/17/2020
 */

@Component("carr")
public class Carr implements IAutomobil{

    private int maxDrivingSpeed = 260;

    private Motor motor;

    @Autowired
    public Carr(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String travel() {
        return "[Car trip] Travel to Grecia with car";
    }

    @Override
    public int maxDrivingSpeed() {
        return this.maxDrivingSpeed;
    }

    public void motorToString(){
        System.out.println(this.motor.toString());
    }
}
