package com.devmind.annotations.temaCurs;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Project: Homework
 * Author: mihai
 * Date: 11/17/2020
 */

@Data
@Component
public class Bus implements IAutomobil{

    private final int maxDrivingSpeed = 120;

    private Motor motor;

    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String travel() {
        return "[Bus trip] Travel to Bulgaria with bus";
    }

    @Override
    public int maxDrivingSpeed() {
        return this.maxDrivingSpeed;
    }

    public void motorToString(){
        System.out.println(this.motor.toString());
    }
}
