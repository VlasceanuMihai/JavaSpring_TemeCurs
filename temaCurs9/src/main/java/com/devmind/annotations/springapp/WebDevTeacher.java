package com.devmind.annotations.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WebDevTeacher {

    @Autowired
    @Qualifier("frameworkKnowledge")
    private ITeacheringService frameworkKnowledge;

    @Autowired
    @Qualifier("mySqlKnowledge")
    private ITeacheringService mySqlKnowledge;

    @Autowired
    private TipsAndTricksService tipsAndTricksService;

    @Autowired
    private TestBeanAnnotation testBeanAnnotation;


//    public void printKnowledge() {
//        System.out.println(frameworkKnowledge.getSomeKnowledge());
//    }

    public void printTip() {
        if (tipsAndTricksService != null) {
            System.out.println(tipsAndTricksService.getTip());
        }
    }

//    public void query(){
//        System.out.println(this.mySqlKnowledge.query());
//    }

    public TestBeanAnnotation text(){
        return this.testBeanAnnotation;
    }

    public void frameworkMethod(){
        System.out.println(this.frameworkKnowledge.teachSomething());
    }

    public void mySqlMethod(){
        System.out.println(this.mySqlKnowledge.teachSomething());
    }
}