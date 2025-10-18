package com.devmind.springapp;



import org.aspectj.lang.JoinPoint;


public class TaskLoggingAspect {
    public void myAdvice(JoinPoint jp) throws Throwable {
        System.out.println("Logare aspect metoda");
    }

}
