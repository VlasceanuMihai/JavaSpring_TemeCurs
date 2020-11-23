package com.devmind.annotations.springapp;

import org.springframework.stereotype.Component;

/**
 * Project: Curs9
 * Author: mihai
 * Date: 11/16/2020
 */

@Component
public class MySqlKnowledge implements ITeacheringService{

    public String query(){
        return "Query database!";
    }

    @Override
    public String teachSomething() {
        return "Teach something about databases!";
    }
}
