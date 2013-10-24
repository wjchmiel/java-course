package com.chmielowiec.lecture56;

import java.util.LinkedHashMap;
import java.util.Map;


class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "{ID is: " + id + "; name is: " + name + "}";
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

        Person person1 = new Person(0, "Bob");
        Person person2 = new Person(1, "Sue");
        Person person3 = new Person(2, "Mike");
        Person person4 = new Person(1, "Sue");

        Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();

        map.put(person1, 1);
        map.put(person2, 2);
        map.put(person3, 3);
        map.put(person4, 1);

        System.out.println(map.keySet());

        for (Person key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

}
