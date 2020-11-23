package com.devmind.annotations;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

/**
 * Project: Curs5
 * Author: mihai
 * Date: 11/3/2020
 */

@Component
@Scope("prototype")
public class Task {
    @Getter
    private static int numberOfTasks;

    @Getter
    private static int taskId;

    @Getter
    private int uniqId;

    @Getter
    @Setter
    private String taskName;

    @Getter
    private Integer executionTime;

    @Value("3000")
    private Integer executionTimeMax;
    @Value("2500")
    private Integer executionTimeMin;


    public void  run() throws InterruptedException {
        Thread.sleep(this.executionTime);
    }

    private static Integer generateId(){
        return taskId++;
    }

    private static Integer decrementId(){
        return taskId--;
    }

    private void initialization(){
        this.uniqId = taskId;
        this.taskName = "Task " + generateId();
        ++numberOfTasks;
        this.executionTime = new Random().nextInt((this.executionTimeMax - this.executionTimeMin) + 1) + this.executionTimeMax;
    }

    @PostConstruct
    public void init(){
        this.uniqId = taskId;
        this.taskName = "Task " + generateId();
        ++numberOfTasks;
        this.executionTime = new Random().nextInt((this.executionTimeMax - this.executionTimeMin) + 1) + this.executionTimeMax;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy...");
    }
}
