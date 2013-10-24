package com.chmielowiec.lecture49;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadObjects {
    public static void main(String[] args) {

        System.out.println("Reading objects...");

        try (FileInputStream fi = new FileInputStream("people.dat")) {

            ObjectInputStream oi = new ObjectInputStream(fi);

            Person person1 = (Person) oi.readObject();
            int nr = oi.read();
            Person person2 = (Person) oi.readObject();


            oi.close();

            System.out.println(person1);
            System.out.println(person2);
            System.out.println(nr);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
