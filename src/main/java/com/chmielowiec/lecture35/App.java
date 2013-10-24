package com.chmielowiec.lecture35;

import java.util.ArrayList;


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

        ArrayList<Machine> list1 = new ArrayList<Machine>();
        list1.add(new Machine());
        list1.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<Camera>();
        list2.add(new Camera());
        list2.add(new Camera());

        System.out.println("showList:");

        showLislt(list1);
        showLislt(list2);

        System.out.println("showList1:");

        showLislt1(list1);
        showLislt1(list2);

        System.out.println("showList2:");


        showLislt2(list1);
        showLislt2(list2);

    }

    public static void showLislt(ArrayList<?> list) {
        for (Object value : list)
            System.out.println(value);
    }

    public static void showLislt1(ArrayList<? extends Machine> list) {
        for (Machine value : list) {
            System.out.println(value);
            value.start();
        }
    }

    public static void showLislt2(ArrayList<? super Camera> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }

}
