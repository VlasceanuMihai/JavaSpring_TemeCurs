package com.devmind.curs11.temaCurs11;

/**
 * Project: temaCurs11
 * Author: mihai
 * Date: 11/24/2020
 */
public class MathTeacher implements ITeacher{

    private WisdomWordsService wisdomWordsService;

    @Override
    public String getHomeWork() {
        return "Equations homework...";

    }

    @Override
    public String getWisdom() {
        return this.wisdomWordsService.getMessage();
    }

    public void setWisdomService(WisdomWordsService wisdomWordsService) {
        this.wisdomWordsService = wisdomWordsService;
    }


}
