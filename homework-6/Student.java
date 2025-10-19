package com.devmind.springapp;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Student {
    Course course;

    private int id;
    private String name;
    private int yearOfStudy;

    @Builder.Default
    private List<Course> enrolledCourses = new ArrayList<>();

    public void enroll (Course course){
        this.enrolledCourses.add(course);
    }

    public void removeCourse(Course course){
        this.enrolledCourses.remove(course);

    }

    public List<Course> seeAllCourses(){
        return enrolledCourses;
    }


}
