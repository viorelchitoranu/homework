package com.devmind.springapp;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Iteacher{
    @Override
    public String getHomework() {
        return "Solve 100 calculus problems";
    }
}
