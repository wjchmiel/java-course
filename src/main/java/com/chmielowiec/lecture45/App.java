package com.chmielowiec.lecture45;


class Person {
    private int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id = " + id + ", name = " + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

public class App {

    public static void main(String[] args) {

        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(15, "Alice");
        Person person3 = new Person(5, "Bob");

        System.out.println(person1.toString());
        System.out.println(person2.toString());

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }
}
