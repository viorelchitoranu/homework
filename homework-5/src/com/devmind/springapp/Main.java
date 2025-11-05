package com.devmind.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Task task1 = context.getBean("newTaskInit", Task.class);
//        Task task2 = context.getBean("newTaskInit", Task.class);
//        Task task3 = context.getBean("newTaskInit", Task.class);
//
//        System.out.println("--------------------");
//       task3.destroy();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Task task = (Task) context.getBean("newTaskInit");
        task.run();


    }
}