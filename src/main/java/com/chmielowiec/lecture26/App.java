package com.chmielowiec.lecture26;


public class App {

    public static void main(String[] args) {
        Machine machine1 = new Machine();

        machine1.start();
        machine1.stop();

        Car car1 = new Car();

        car1.showInfo();
        car1.start();
        car1.riding();
        car1.stop();
    }

}
