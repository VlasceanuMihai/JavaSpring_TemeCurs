package com.workshop.fizzBuzzTDD;

import org.springframework.stereotype.Component;

/**
 * Project: Homework
 * Author: mihai
 * Date: 11/22/2020
 */

@Component("fizzBuzz")
public class FizzBuzzService {

        public String computeFizzBuzz(int number){
            if (number % 3 == 0 && number % 5 == 0){
                return "FizzBuzz";
            }else if (number % 3 == 0){
                return "Fizz";
            }else if (number % 5 == 0){
                return "Buzz";
            }
            return String.valueOf(number);
        }
}
