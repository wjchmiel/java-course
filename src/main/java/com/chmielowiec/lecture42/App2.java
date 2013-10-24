package com.chmielowiec.lecture42;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class App2 {

    public static void main(String[] args) {

        String fileName = "test2.txt";

        File textFile = new File(fileName);

        /* Without buffering writing can be very inefficient
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(textFile);
            System.out.println("File open.");

            fileWriter.write("This is line one.\n");
            fileWriter.write("This is line two.\n");

            fileWriter.close();

        } catch (IOException e) {
            System.out.println("Unable to write file " + textFile.toString());
        }

        System.out.println("File closed.");
        */


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(textFile))) {
            System.out.println("File open.");

            bw.write("This is line one.\n");
            bw.write("This is line two.\n");
            bw.write("This is line three.\n");
        } catch (IOException e) {
            System.out.println("Unable to write file " + textFile.toString());
        }

        System.out.println("File closed.");


    }
}
