package com.devmind.springapp;
import lombok.Data;


public class Main {
    public static void main(String[] args) {

//        Student student1 = Student.builder().id(123).yearOfStudy(1).name("Ion").build();
//        Student student2 = Student.builder().id(124).yearOfStudy(1).name("Vasile").build();
//        Student student3 = Student.builder().id(125).yearOfStudy(1).name("Adrian").build();
//        Student student4 = Student.builder().id(126).yearOfStudy(1).name("James").build();
//        //System.out.println(student1);
//
//        Course course1 = Course.builder().credits(20).name("Matematica").teacher("Alex").build();
//        Course course2 = Course.builder().credits(25).name("Fizica").teacher("Irina").build();
//        //System.out.println(course1);
//
//        StudentServiceImpl studentService = new StudentServiceImpl();
//        studentService.addStudent(student1);
//        studentService.addStudent(student2);
//        studentService.addStudent(student3);
//        studentService.addStudent(student4);
//        System.out.println(studentService.getStudents());
//        System.out.println("-----------------------------------");
//
//        student1.enroll(course1);
//        student1.enroll(course2);
//
//        System.out.println(student1.seeAllCourses());
//        System.out.println("----------------------------");
//
//        student1.removeCourse(course2);
//        System.out.println(student1.seeAllCourses());
        Course c1 = Course.builder().credits(20).name("Math").teacher("Alex").build();

        Student s1 = Student.builder().name("Ion").id(123).yearOfStudy(1).build();

        s1.enroll(c1);
        System.out.println(s1.seeAllCourses());






    }
}
