package com.devmind.annotations.springapp;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Project: Curs9
 * Author: mihai
 * Date: 11/16/2020
 */
public class WebDevTeacherTest {
    private static AnnotationConfigApplicationContext applicationContext;

    @BeforeClass
    public static void setup(){
        applicationContext = new AnnotationConfigApplicationContext(ConfigCurs9.class);
    }

    @Test
    public void test(){
        WebDevTeacher webDevTeacher = applicationContext.getBean("webDevTeacher", WebDevTeacher.class);
        webDevTeacher.frameworkMethod();
        webDevTeacher.mySqlMethod();
        webDevTeacher.text();
        webDevTeacher.printTip();
    }
}
