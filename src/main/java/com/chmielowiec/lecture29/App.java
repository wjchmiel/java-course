package com.chmielowiec.lecture29;

import com.chmielowiec.world.Field;
import com.chmielowiec.world.Oak;
import com.chmielowiec.world.Plant;


public class App {

    public static void main(String[] args) {

        Plant plant1 = new Plant();

        System.out.println("Name: " + plant1.getName() + ", ID: " + Plant.ID + ", type: " + plant1.getType()
                + ", size: " + plant1.getSize());

        Oak oak1 = new Oak();

        System.out.println("Name: " + oak1.getName() + ", ID: " + Oak.ID + ", type: " + oak1.getType()
                + ", size: " + oak1.getSize());

        Field field1 = new Field();

        // To nie działa - type jest protected, a App nie jest w tym samym package co Plant
        //System.out.println(plant1.type);

        //age is not public in world.Plant; cannot be accessed from outside package
        //System.out.println(oak1.age);

        Grass grass1 = new Grass();

        System.out.println("size: " + grass1.getSize());

        Plant plant2 = plant1;
        plant2.setName("Agawa");
        plant2.setSize(62);

        System.out.println("Name plant1: " + plant1.getName() + ", name plant2: " + plant2.getName()
                + ", size plant1 " + plant1.getSize() + ", size plant2: " + plant2.getSize());

    }
}
