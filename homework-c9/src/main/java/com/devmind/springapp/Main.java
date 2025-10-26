package com.devmind.springapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        try(context){


            ITeacher teacher = context.getBean("javaTeacher", ITeacher.class);
            System.out.println(teacher.getWisdom());
            System.out.println(teacher.getHomeWork());

            System.out.println(((JavaTeacher)teacher).getAge());
            System.out.println(((JavaTeacher) teacher).getWorkPlace());
            System.out.println("_______________________");

            ITeacher teacher2 = context.getBean("mathTeacher", ITeacher.class);
            System.out.println(teacher2.getWisdom());
            System.out.println(teacher2.getHomeWork());



        }


    }
}
