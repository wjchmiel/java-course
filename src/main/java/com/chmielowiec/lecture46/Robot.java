package com.chmielowiec.lecture46;


public class Robot {

    private int id;

    // First inner class example

    private class Brain {
        public void think() {
            //accessing to outer non-static class data
            System.out.println("Robot " + id + " is thinking.");
        }
    }


    // Second inner class example - static case

    public static class Battery {
        public void charge() {
            System.out.println("Battery charging...");
        }
    }

    public Robot(int id) {
        this.id = id;
    }

    public void start() {

        // Third inner class example - classes within methods, "local classes"

        final String name = "Robert";

        class Temp {
            public void doSomething() {
                System.out.println("ID is: " + id);
                System.out.println("My name is " + name);
            }
        }


        System.out.println("Starting robot " + id + ".");

        Brain brain = new Brain();
        brain.think();

        Temp temp = new Temp();
        temp.doSomething();
    }
}
