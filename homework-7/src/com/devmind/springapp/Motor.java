package com.devmind.springapp;

import lombok.*;
import org.springframework.stereotype.Component;


@Getter
@Setter

@Builder

public class Motor {
    private int putere;
    private String nume;
    private int numarCilindri;


}
