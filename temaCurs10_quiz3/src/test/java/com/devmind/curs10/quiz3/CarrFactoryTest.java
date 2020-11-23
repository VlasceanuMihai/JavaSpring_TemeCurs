package com.devmind.curs10.quiz3;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Project: Curs10
 * Author: mihai
 * Date: 11/18/2020
 */

@RunWith(MockitoJUnitRunner.class)
public class CarrFactoryTest {
    private static AnnotationConfigApplicationContext applicationContext;

    @Mock
    MotorFactory motorFactory;

    @InjectMocks
    CarFactory carFactory;

    @BeforeClass
    public static void setup(){
        applicationContext = new AnnotationConfigApplicationContext(ConfigQuiz3.class);
    }

    @Test
    public void createCar_electric() throws ClassNotFoundException {
        Mockito.when(motorFactory.produceMotor(MotorFactory.ELECTRIC_FUEL_TYPE)).thenReturn(new ElectricMotor());

        Car car = carFactory.createCar("Opel", MotorFactory.ELECTRIC_FUEL_TYPE);


        Assert.assertEquals("LOW", car.getPolutionCategory().toString());
    }

    @Test
    public void createCar_diesel() throws ClassNotFoundException {
        Mockito.when(motorFactory.produceMotor(MotorFactory.DIESEL_FUEL_TYPE)).thenReturn(new DieselMotor());

        Car car = carFactory.createCar("Opel", MotorFactory.DIESEL_FUEL_TYPE);
        Assert.assertEquals("HIGH", car.getPolutionCategory().toString());
    }

    @Test
    public void createCar_petrol() throws ClassNotFoundException {
        Mockito.when(motorFactory.produceMotor(MotorFactory.PETROL_FUEL_TYPE)).thenReturn(new PetrolMotor());

        Car car = carFactory.createCar("Opel", MotorFactory.PETROL_FUEL_TYPE);
        Assert.assertEquals("MEDIUM", car.getPolutionCategory().toString());
    }


    @Test(expected = IllegalArgumentException.class)
    public void createCar_exception(){
        Mockito.when(motorFactory.produceMotor("carbuni")).thenThrow(IllegalArgumentException.class);

        Car car = carFactory.createCar("Tesla", "carbuni");
//        Assert.assertEquals("HIGH", car.getPolutionCategory().toString());
    }
}
