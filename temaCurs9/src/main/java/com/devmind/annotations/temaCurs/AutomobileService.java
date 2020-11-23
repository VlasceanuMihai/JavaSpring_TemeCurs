package com.devmind.annotations.temaCurs;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Project: Homework
 * Author: mihai
 * Date: 11/17/2020
 */

@Data
@Component("automobileService")
public class AutomobileService {

    @Autowired
    @Qualifier("carr")
    private Carr carr;
    private Motorcycle motorcycle;
    private Bus bus;

    @Autowired
    public AutomobileService(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    @Autowired
    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public String travelWithCar(){
        return this.carr.travel();
    }

    public String travelWithMotorcycle(){
        return this.motorcycle.travel();
    }

    public String travelWithBus(){
        return this.bus.travel();
    }

    public void maxDrivingSpeedForCar(){
        System.out.println(this.carr.maxDrivingSpeed());
    }

    public void maxDrivingSpeedForMotorcycle(){
        System.out.println(this.motorcycle.maxDrivingSpeed());
    }

    public void maxDrivingSpeedForBus(){
        System.out.println(this.bus.maxDrivingSpeed());
    }

    public void motorToStringForCar(){
        this.carr.motorToString();
    }

    public void motorToStringForBus(){
        this.bus.motorToString();
    }

    public void motorToStringForMotorcycle(){
        this.motorcycle.motorToString();
    }
}
