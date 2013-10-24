package com.chmielowiec.lecture47;


public class App {
    public static void main(String[] args) {

        Animal animal = Animal.DOG;

        switch (animal) {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                System.out.println("Mouse");
                break;
            case HORSE:
                System.out.println("Horse");
                break;
        }

        Animal animal1 = Animal.valueOf("CAT");

        System.out.println(animal);
        System.out.println(animal1);
        System.out.println("Enum name as a string: " + Animal.CAT.name());

        System.out.println(animal.getClass());

        System.out.println(animal instanceof Enum);

        System.out.println(Animal.MOUSE.getName());


    }
}
