package com.devmind.springapp;

import lombok.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sedan")
@Data
@Builder

public class Masina implements IAutomobil{
    // prin constructor
    private Motor motor;

    @Override
    public int travel() {
        return 500;
    }

    @Override
    public int maxDrivingSpeed() {
        return 200;
    }

    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String descriereMotor() {
        return "Sedan cu " + motor.getNumarCilindri() + " cilindri și " + motor.getPutere() + " CP";
    }

    @Autowired
    public Masina(@Qualifier("motorSedan") Motor motor) {
        this.motor = motor;
    }


}
