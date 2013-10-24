package com.chmielowiec.lecture47;


public enum Animal {
    CAT("Mruczek"), DOG("Reks"), MOUSE("Miki"), HORSE("Jerry");

    private String name;

    public String getName() {
        return name;
    }

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "This animal is called " + name;
    }
}
