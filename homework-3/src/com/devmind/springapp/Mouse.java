package com.devmind.springapp;

public class Mouse implements IAnimal{
    @Override
    public String makeSound() {
        return "Sniff Sniff";
    }
}
