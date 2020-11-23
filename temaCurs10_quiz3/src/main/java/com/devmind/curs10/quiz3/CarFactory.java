package com.devmind.curs10.quiz3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Project: Curs10
 * Author: mihai
 * Date: 11/18/2020
 */

@Component("carFactory")
public class CarFactory {

    private MotorFactory motorFactory;

    @Autowired
    public CarFactory(MotorFactory motorFactory) {
        this.motorFactory = motorFactory;
    }

    public Car createCar(String name, String fuel) {
        return new Car(name, this.motorFactory.produceMotor(fuel));
    }
}
