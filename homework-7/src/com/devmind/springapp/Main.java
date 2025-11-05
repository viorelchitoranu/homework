package com.devmind.springapp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        // EXERCITIUL 1
//        try (context) {
//            Garaj g = context.getBean(Garaj.class);
//            g.printStatus();
//        }
        // EXERCITIUL 2
        try (context) {
            IAutomobil sedan = context.getBean("sedan", IAutomobil.class);
            IAutomobil motocicleta = context.getBean("motocicleta", IAutomobil.class);
            IAutomobil autobuz = context.getBean("autocar", IAutomobil.class);

            System.out.println(sedan.descriereMotor());
            System.out.println(motocicleta.descriereMotor());
            System.out.println(autobuz.descriereMotor());


        }

    }
}
