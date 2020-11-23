package com.devmind.annotations.springapp;


/**
 * Project: Curs9
 * Author: mihai
 * Date: 11/16/2020
 */

public class TestBeanAnnotation {
    private String stg;
    private int integer;

    public TestBeanAnnotation(String stg, int integer) {
        this.stg = stg;
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "TestBeanAnnotation{" +
                "stg='" + stg + '\'' +
                ", integer=" + integer +
                '}';
    }
}
