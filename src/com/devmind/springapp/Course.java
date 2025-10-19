package com.devmind.springapp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@AllArgsConstructor
@Builder
public class Course {
    private String name;
    private String teacher;
    private int credits;
}
