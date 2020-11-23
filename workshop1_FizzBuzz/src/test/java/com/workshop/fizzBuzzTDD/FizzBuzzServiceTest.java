package com.workshop.fizzBuzzTDD;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Project: Homework
 * Author: mihai
 * Date: 11/22/2020
 */

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ConfigFizzBuzz.class, loader = AnnotationConfigContextLoader.class)
class FizzBuzzServiceTest {

    @Autowired
    private FizzBuzzService fizzBuzzService;

    @Test
    void computeFizzBuzz_withNumberDivisibleBy3_expectFizz(){
        Assert.assertEquals("Fizz", fizzBuzzService.computeFizzBuzz(9));
    }

    @Test
    void computeFizzBuzz_withNumberDivisibleBy5_expectBuzz(){
        Assert.assertEquals("Buzz", this.fizzBuzzService.computeFizzBuzz(10));
    }

    @Test
    void computeFizzBuzz_withNumberDivisibleBy3And5_expectFizzBuzz(){
        Assert.assertEquals("FizzBuzz", this.fizzBuzzService.computeFizzBuzz(30));
    }

    @Test
    void computeFizzBuzz_withNumberNeitherDivisibleBy3Or5_expectNumberToString(){
        int integer = 17;
        Assert.assertEquals(String.valueOf(integer), this.fizzBuzzService.computeFizzBuzz(integer));
    }

//    @Test
//    public void computeFizzBuzz_withNumberNeitherDivisibleBy3Or5_expectNumberToString(){
//
//    }
}
