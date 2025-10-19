package com.devmind.springapp;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class StudentServiceImpl implements IStudentService {
    List<Student> students = new ArrayList<Student>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(String name) {
        students.removeIf(student -> student.getName().equals(name));
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Student findByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
}
