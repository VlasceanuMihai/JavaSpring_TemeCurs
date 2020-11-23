package com.devmind.annotations.springapp;

import org.springframework.stereotype.Component;

@Component
public class FrameworkKnowledge implements ITeacheringService{

    public String getSomeKnowledge() {
        return "Frameworks are your friend, not your enemy!";
    }

    @Override
    public String teachSomething() {
        return "Teach something about frameworks!";
    }
}