package com.chmielowiec.lecture41;


public class Motor extends Machine {

    @Override
    public void start() {
        System.out.println("Motor is starting.");
    }

    @Override
    public void doStaff() {
        System.out.println("Do stuff in motor.");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown motor.");
    }
}
