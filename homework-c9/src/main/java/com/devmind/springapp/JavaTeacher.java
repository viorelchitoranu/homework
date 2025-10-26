package com.devmind.springapp;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Setter
@Getter
@RequiredArgsConstructor
@Component("javaTeacher")
@Primary
@ToString
public class JavaTeacher implements ITeacher{
    private final WisdomWordsService wisdomService;

    @Value("${teacher.java.age:0}")
    private int age;

    @Value("${teacher.java.workPlace:Unknown}")
    private String workPlace;

    @Override
    public String getHomeWork() {
        return "Create 100 classes";
    }

    @Override
    public String getWisdom() {
        return "Java teacher says: " + wisdomService.getMessage();
    }
}
