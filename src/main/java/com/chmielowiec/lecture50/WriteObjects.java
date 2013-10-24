package com.chmielowiec.lecture50;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;


public class WriteObjects {
    public static void main(String[] args) {

        Person[] people = {new Person(23, "Sue"),
                new Person(99, "Mike"), new Person(322, "Bob")};


        ArrayList<Person> peopleList = new ArrayList<>(Arrays.asList(people));

        System.out.println("Writing objects...");

        try (FileOutputStream fs = new FileOutputStream("people.dat")) {

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(people);

            os.writeObject(peopleList);

            os.writeInt(peopleList.size());

            for (Person person : peopleList) {
                os.writeObject(person);
            }


            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
