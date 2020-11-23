package com.annotations;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Project: TemaCurs7
 * Author: mihai
 * Date: 11/15/2020
 */

@Data
@Component
public class WebDevTeacher implements ITeacher {
    private String description;
    private int grade;


    @Autowired
    public WebDevTeacher(String description){
        this.description = description;
    }

    @Override
    public String homework() {
        return "Create your server backend context!";
    }

    @Override
    public String toString() {
        return "WebDevTeacher{" +
                "description='" + description + '\'' +
                ", grade=" + grade +
                '}';
    }
}
