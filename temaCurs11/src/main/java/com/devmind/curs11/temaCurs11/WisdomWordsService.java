package com.devmind.curs11.temaCurs11;

import org.springframework.beans.factory.annotation.Value;

/**
 * Project: temaCurs11
 * Author: mihai
 * Date: 11/24/2020
 */

public class WisdomWordsService {

    @Value("${wisdom.message}")
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
