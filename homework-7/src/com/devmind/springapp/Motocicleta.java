package com.devmind.springapp;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("motocicleta")
@Data
@Builder


public class Motocicleta implements IAutomobil {

    // prin field

    @Autowired @Qualifier("motorMotocicleta")
    private Motor motor;

    @Override
    public int travel() {
        return 100;
    }

    @Override
    public int maxDrivingSpeed() {
        return 150;
    }

    @Override
    public String descriereMotor() {
        return "Motocicletă cu motor " + motor.getNume() + " (" + motor.getPutere() + " CP)";
    }
}
