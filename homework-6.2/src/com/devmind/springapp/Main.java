package com.devmind.springapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Iteacher web = context.getBean("ourDevTeacher", Iteacher.class);
        System.out.println("WebDevTeacher: " + web.getHomework());

        Iteacher math = context.getBean("mathTeacher", Iteacher.class);
        System.out.println("MathTeacher: " + math.getHomework());

    }
}
