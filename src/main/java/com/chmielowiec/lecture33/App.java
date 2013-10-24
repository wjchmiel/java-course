package com.chmielowiec.lecture33;


class Machine {

    protected String name = "machine type 1212";
    private int id = 6;

    public void start() {
        System.out.println("Machine started.");
    }

    public void stop() {
        System.out.println("Machine stopped.");
    }

    public void showInfo() {
        System.out.println("Machine ID is " + id);
    }

    public String toString() {
        return "I am a machine.";
    }
}


class Camera extends Machine {

    public void start() {
        System.out.println("Camera started.");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }

    public String toString() {
        return "I am a camara.";
    }
}


public class App {

    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        System.out.println("-- Upcasting --");

        //Upcasting

        Machine machine2 = new Camera();
        machine2.start();
        machine2 = camera1;
        machine2.start();


        System.out.println("-- Downcasting --");

        //Downcasting

        Machine machine3 = new Camera();
        Camera camera2;
        camera2 = (Camera) machine3;
        camera2.start();
        camera2.snap();
    }

}
