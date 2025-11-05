package com.devmind.springapp;

import org.springframework.stereotype.Component;

@Component("ourDevTeacher")
public class WebDevTeacher implements Iteacher{
    @Override
    public String getHomework() {
        return "Create your server backend context!";
    }
}
