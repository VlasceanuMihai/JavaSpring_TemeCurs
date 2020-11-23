package com.devmind.curs10.quiz3;

import org.springframework.stereotype.Component;

/**
 * Project: Curs10
 * Author: mihai
 * Date: 11/18/2020
 */

@Component
public class MotorFactory {

    static final String ELECTRIC_FUEL_TYPE = "electric";
    static final String DIESEL_FUEL_TYPE = "diesel";
    static final String PETROL_FUEL_TYPE = "petrol";

    public Motor produceMotor(String fuel) {
        switch (fuel){
            case ELECTRIC_FUEL_TYPE:
                return new ElectricMotor();
            case DIESEL_FUEL_TYPE:
                return new DieselMotor();
            case PETROL_FUEL_TYPE:
                return new PetrolMotor();
            default:
                throw new IllegalArgumentException("[ERROR] Wrong motor!");
        }
    }
}
