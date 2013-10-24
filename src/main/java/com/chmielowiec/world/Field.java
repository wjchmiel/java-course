package com.chmielowiec.world;


public class Field {
    private Plant plant1 = new Plant();

    public Field() {
        System.out.println("Konstruktor!" + " size: " + plant1.getSize() + ", age: " + plant1.age);
    }
}
