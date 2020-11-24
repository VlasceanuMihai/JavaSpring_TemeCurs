package com.devmind.curs11.temaCurs11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Project: temaCurs11
 * Author: mihai
 * Date: 11/23/2020
 */

@Configuration
@ComponentScan("com.devmind.curs11.temaCurs11")
@PropertySource("classpath:values.properties")
public class TeacherConfig {

    @Bean
    public ITeacher javaTeacher(){
        return new JavaTeacher(this.wisdomWordsService());
    }

    @Bean
    public ITeacher mathTeacher(){
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.setWisdomService(this.wisdomWordsService());
        return mathTeacher;
    }

    @Bean
    public WisdomWordsService wisdomWordsService(){
        return new WisdomWordsService();
    }

    @Bean
    public MyPrototypeBean myPrototypeBean(){
        return new MyPrototypeBean();
    }
}
