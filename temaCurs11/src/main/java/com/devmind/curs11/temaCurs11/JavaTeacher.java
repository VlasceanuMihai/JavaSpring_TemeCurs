package com.devmind.curs11.temaCurs11;

/**
 * Project: temaCurs11
 * Author: mihai
 * Date: 11/24/2020
 */

public class JavaTeacher implements ITeacher{

    private WisdomWordsService wisdomWordsService;

    public JavaTeacher(WisdomWordsService wisdomWordsService) {
        this.wisdomWordsService = wisdomWordsService;
    }

    @Override
    public String getHomeWork() {
        return "Java homework...";
    }

    @Override
    public String getWisdom() {
        return wisdomWordsService.getMessage();
    }
}
