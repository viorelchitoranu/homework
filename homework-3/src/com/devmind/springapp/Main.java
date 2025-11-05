package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        IAnimal dog = (IAnimal) context.getBean("dog");
        IAnimal cat = (IAnimal) context.getBean("cat");
        //System.out.println(dog.makeSound());
        //System.out.println(cat.makeSound());

        Dog d = (Dog) context.getBean("dog");
        System.out.println(d.makeSound());
        System.out.println(d.getAnimalName());

    }
}
