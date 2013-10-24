package com.chmielowiec.lecture49;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteObjects {
    public static void main(String[] args) throws FileNotFoundException {


        Person mike = new Person(324, "Mike");
        Person sue = new Person(42, "Sue");
        int number = 112;

        System.out.println(mike);
        System.out.println(sue);
        System.out.println(number);

        System.out.println("Writing objects...");

        try (FileOutputStream fs = new FileOutputStream("people.dat")) {

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(mike);
            os.write(number);
            os.writeObject(sue);

            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
