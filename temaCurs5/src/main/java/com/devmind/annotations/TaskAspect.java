package com.devmind.annotations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Project: TemaCurs5
 * Author: mihai
 * Date: 11/10/2020
 */

@Aspect
public class TaskAspect {
    @Pointcut("execution(public void run())")
    private void runTask(){}

    @Before(value = "runTask()", argNames = "joinPoint")
    public void beforeCall(JoinPoint joinPoint){
        System.out.println("Method name: " + joinPoint.getSignature().toShortString());
    }
}
