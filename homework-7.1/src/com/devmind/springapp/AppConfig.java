package com.devmind.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.devmind.springapp")
public class AppConfig {

    @Bean
    public Motor motorSedan(){
        Motor m;
        m = Motor.builder().nume("Eco").putere(110).numarCilindri(3).build();
        return m;
    }

    @Bean
    public Motor motorMotocicleta(){
        Motor m;
        m = Motor.builder().nume("Sport").putere(150).numarCilindri(2).build();
        return m;
    }
    @Bean
    @Primary
    public Motor motorAutocar(){
        Motor m;
        m = Motor.builder().nume("Diesel").putere(250).numarCilindri(8).build();
        return m;
    }


}
