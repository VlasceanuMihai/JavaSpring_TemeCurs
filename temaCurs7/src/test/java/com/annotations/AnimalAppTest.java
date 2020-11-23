package com.annotations;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Project: Homework
 * Author: mihai
 * Date: 11/15/2020
 */

public class AnimalAppTest {

    private static AnnotationConfigApplicationContext appContext;

    @BeforeClass
    public static void setup(){
        appContext = new AnnotationConfigApplicationContext(ConfigTemaCurs7.class);
    }

    @Test
    public void test(){
        ITeacher teacher = (ITeacher) appContext.getBean("webDevTeacher", WebDevTeacher.class);
        System.out.println(teacher);
        System.out.println(teacher.homework());
        System.out.println(teacher.getGrade());
        teacher.setGrade(100);
        System.out.println(teacher.getGrade());
    }

    @AfterClass
    public static void close(){
        appContext.close();
    }
}
