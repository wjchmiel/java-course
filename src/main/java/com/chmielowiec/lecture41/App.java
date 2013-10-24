package com.chmielowiec.lecture41;


public class App {

    public static void main( String[] args ){

        Bike bike1 = new Bike();
        bike1.setId(21);
        System.out.println("Bike id: " + bike1.getId());


        Motor motor1 = new Motor();
        motor1.setId(550);
        System.out.println("Motor id: " + motor1.getId());

        motor1.run();
        bike1.run();

    }
}
