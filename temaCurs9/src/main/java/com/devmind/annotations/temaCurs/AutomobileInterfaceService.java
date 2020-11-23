package com.devmind.annotations.temaCurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Project: Homework
 * Author: mihai
 * Date: 11/17/2020
 */

@Component
public class AutomobileInterfaceService {

    @Autowired
    @Qualifier("motorcycle")
    private IAutomobil motorcycle;

    @Autowired
    @Qualifier("carr")
    private IAutomobil carr;

    public String getMaxSpeedForCar(){
        return "Max speed for car: " + this.carr.maxDrivingSpeed();
    }

    public String getMaxSpeedForMotorcycle(){
        return "Max speed for motorcycle: " + this.motorcycle.maxDrivingSpeed();
    }
}
