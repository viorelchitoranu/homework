package com.devmind.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Garaj {

    // prin constructor - ar trebui sa injecteze MASINA
    private IAutomobil automobil1;


    @Autowired
    public Garaj(@Qualifier("sedan") IAutomobil automobil1) {
        this.automobil1 = automobil1;
    }

    // prin setter - ar trebui sa injecteze AUTOCAR

    private IAutomobil automobil2;

    @Autowired
    public void setAutomobil2(IAutomobil automobil2) {
        this.automobil2 = automobil2;
    }

    // prin field - ar trebui sa injecteze MOTOCICLETA
    @Autowired
    @Qualifier("motocicleta")
    private IAutomobil automobil3;


    public void printStatus() {
        System.out.println("Constructor " + automobil1.toString());
        System.out.println("Setter " + automobil2.toString());
        System.out.println("Field " + automobil3.toString());
    }


}
