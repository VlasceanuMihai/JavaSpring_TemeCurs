package quiz3;

/**
 * Project: Curs10
 * Author: mihai
 * Date: 11/18/2020
 */


public class Car {

    private Motor motor;
    private String name;

    public Car(String name, Motor motor) {
        this.motor = motor;
        this.name = name;
    }

    public PolutionCategory getPolutionCategory (){
        return this.motor.getPolutionCategory();
    }
}
