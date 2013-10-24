package com.chmielowiec.lecture50;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class ReadObjects {
    public static void main(String[] args) {

        System.out.println("Reading objects...");

        try (FileInputStream fi = new FileInputStream("people.dat")) {

            ObjectInputStream oi = new ObjectInputStream(fi);


            Person[] people = (Person[]) oi.readObject();

            ArrayList<Person> peopleList = (ArrayList<Person>) oi.readObject();

            int number = oi.readInt();

            for (Person person : people) {
                System.out.println("Array: " + person);
            }

            for (Person person : peopleList) {
                System.out.println("ArrayList: " + person);
            }

            for (int i = 0; i < number; i++) {
                Person person = (Person) oi.readObject();

                System.out.println("ArrayList one by one: " + person);
            }


            oi.close();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
