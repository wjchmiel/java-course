package com.chmielowiec.lecture26;


public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    public void riding() {
        System.out.println("Car is riding.");
    }

    public void showInfo() {
        System.out.println("Car model: " + name);
    }
}
