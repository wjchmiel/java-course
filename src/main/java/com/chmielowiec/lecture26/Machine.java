package com.chmielowiec.lecture26;


public class Machine {

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
