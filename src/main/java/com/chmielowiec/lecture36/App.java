package com.chmielowiec.lecture36;


class Machine {


    public void start() {
        System.out.println("Machine started.");
    }

    public void stop() {
        System.out.println("Machine stopped.");
    }
}

interface Plant {
    public void grow();
}


public class App {

    public static void main(String[] args) {

        Machine machine1 = new Machine() {
            @Override
            public void start() {
                System.out.println("Car started.");
            }
        };

        machine1.start();

        Plant plant1 = new Plant() {
            public void grow() {

                System.out.println("Plant is growing.");
            }
        };

        plant1.grow();
    }
}
