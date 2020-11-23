package com;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Project: Curs3
 * Author: mihai
 * Date: 10/28/2020
 */

public class AnimalAppContextTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog);
        System.out.println(dog.makeSound());

        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(cat);
        System.out.println(cat.makeSound());

        Mouse mouse = context.getBean("mouse", Mouse.class);
        System.out.println(mouse);
        System.out.println(mouse.makeSound());

        Dog dog1 = context.getBean("dog", Dog.class);
        System.out.println(dog1);
        System.out.println(dog1.makeSound());
    }


    @Test
    public void xmlTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("applicationContext.xml");

        IAnimal rexDog = applicationContext.getBean("rexDog", IAnimal.class);
        IAnimal bobitaDog = applicationContext.getBean("bobitaDog", IAnimal.class);
        IAnimal tomCat = applicationContext.getBean("tomCat", IAnimal.class);
        IAnimal jerryMouse = applicationContext.getBean("jerryMouse", IAnimal.class);
        System.out.println(rexDog);
        System.out.println(bobitaDog);
        System.out.println(tomCat);
        System.out.println(jerryMouse);

        System.out.println(rexDog.makeSound());
        System.out.println(bobitaDog.makeSound());
        System.out.println(tomCat.makeSound());
        System.out.println(jerryMouse.makeSound() + "\n");

        System.out.println(rexDog.getName());
        System.out.println(bobitaDog.getName());
        System.out.println(tomCat.getName());
        System.out.println(jerryMouse.getName());

        Dog dog = applicationContext.getBean("rexDog", Dog.class);
        System.out.println(dog.getAge());

        System.out.println("rexDog ref: " + rexDog + "\ndog ref: " + dog);

        Assert.assertEquals(dog, rexDog);
    }
}
