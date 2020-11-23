package com.devmind.annotations;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Project: Curs5
 * Author: mihai
 * Date: 11/3/2020
 */

@ContextConfiguration(classes = Config.class, loader = AnnotationConfigContextLoader.class)
public class Application {

    @Test
    public void annotationsTest(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        System.out.println("Annotation application context");
        System.out.println("Singletone...");

        Task task = annotationConfigApplicationContext.getBean("task", Task.class);
        System.out.println("Task: " + task);
        System.out.println(task.getTaskName());
        System.out.println(task.getUniqId());
        System.out.println("Number of tasks: " + Task.getNumberOfTasks());
        System.out.println();

        Task task1 = annotationConfigApplicationContext.getBean("task", Task.class);
        System.out.println("Task: " + task1);
        System.out.println(task1.getTaskName());
        System.out.println(task1.getUniqId());
        System.out.println("Number of tasks: " + Task.getNumberOfTasks());
        System.out.println();

        System.out.println("Prototype...");
        Task prototypeTask = annotationConfigApplicationContext.getBean("task", Task.class);
        System.out.println("Task: " + prototypeTask);
        System.out.println(prototypeTask.getTaskName());
        System.out.println(prototypeTask.getUniqId());
        System.out.println("Number of tasks: " + Task.getNumberOfTasks());
        System.out.println();

        Task prototypeTask1 = annotationConfigApplicationContext.getBean("task", Task.class);
        System.out.println("Task: " + prototypeTask1);
        System.out.println(prototypeTask1.getTaskName());
        System.out.println(prototypeTask1.getUniqId());
        System.out.println("Number of tasks: " + Task.getNumberOfTasks());
        System.out.println();
    }

    @Ignore
    @Test
    public void xmlTest() throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");

        System.out.println("Prototype bean...");
        Task task = applicationContext.getBean("task", Task.class);
        System.out.println("Task execution time: " + task.getExecutionTime());
        System.out.println("Task: " + task);
        System.out.println(task.getTaskName());
        System.out.println("Number of tasks: " + Task.getNumberOfTasks());
        // 2 prints: Annotation + xml config
        task.run();
        System.out.println();

        Task task1 = applicationContext.getBean("task", Task.class);
        System.out.println("Task: " + task1);
        System.out.println(task1.getTaskName());
        System.out.println("Number of tasks: " + Task.getNumberOfTasks());
        System.out.println(task1.getUniqId());
        System.out.println();

        Task task2 = applicationContext.getBean("task", Task.class);
        System.out.println("Task: " + task2);
        System.out.println(task2.getTaskName());
        System.out.println("Number of tasks: " + Task.getNumberOfTasks());
        System.out.println(task2.getUniqId());
        System.out.println("\n");

        /* Depinde de strategia de create a beanurilor:
            - Daca bean-ul este singletone - lazy-init = "true", obiectul se va crea in momentul apelari beanului,
                deci bean-ul va fi "Task 3" -> numberOfTasks = 4
            - Daca bean-ul este singletone - lazy-init = "false", obiectul se va crea in momentul in care contextul se creaza,
                deci bean-ul va fi "Task 0" -> numberOfTasks = 4
        */
        System.out.println("Singletone bean...");
        Task singletoneBean = applicationContext.getBean("singletoneTask", Task.class);
        System.out.println("Task: " + singletoneBean);
        System.out.println(singletoneBean.getTaskName());
        System.out.println("Number of tasks: " + Task.getNumberOfTasks());
        System.out.println();

        applicationContext.close();

    }
}
