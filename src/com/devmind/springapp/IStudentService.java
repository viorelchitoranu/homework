package com.devmind.springapp;

import java.util.List;

public interface IStudentService {
    void addStudent(Student student);
    void removeStudent(String name);
    List<Student> getStudents();
    Student findByName(String name);
}
