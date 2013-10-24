package com.chmielowiec.lecture28;


public class App {

    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Bob");
        person1.greet();

        Info info1 = new Machine();
        info1.showInfo();

        Info info2 = new Person("Alice");
        info2.showInfo();

        info2 = person1;
        info2.showInfo();

        info2 = info1;
        info2.showInfo();

        System.out.println();

        outputInfo(mach1);
        outputInfo(person1);
        outputInfo(info1);
        outputInfo(info2);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
