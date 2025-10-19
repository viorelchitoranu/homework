package com.devmind.springapp;

import lombok.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("autocar")
@Data
@Builder
@AllArgsConstructor
@Primary
public class Autocar implements IAutomobil{

// prin setter
    private Motor motor;

    @Override
    public int travel() {
        return 300;
    }

    @Override
    public int maxDrivingSpeed() {
        return 110;
    }

    @Override
    public String descriereMotor() {
        return "Autocar cu " + motor.getNumarCilindri() + " cilindri și " + motor.getPutere() + " CP";
    }

    @Autowired
    public void setMotor(@Qualifier("motorAutocar")Motor motor) {
        this.motor = motor;
    }
}
