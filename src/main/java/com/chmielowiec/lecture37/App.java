package com.chmielowiec.lecture37;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "c:\\Users\\Witek\\dane.txt";

        File textFile = new File(fileName);
        System.out.println("File destination: " + textFile.getAbsolutePath());
        /*
        //writing to a file

        FileWriter fw = null;
        try {
            fw = new FileWriter(textFile);

            System.out.println("File open.");

            for (int i = 1; i < 10; i++) {

                fw.write(i + ". file line\n");
            }

            fw.close();
            System.out.println("File closed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        //reading a file

        Scanner in = null;
        in = new Scanner(textFile);


        //int value = in.nextInt();
        //System.out.println("Read integer value: " + value);

        //read invisible character after an integer at the beginning of file
        //in.nextLine();

        //The first line has already been read, so count = 2
        int count = 1;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(count + ": " + line);
            count++;
        }

        in.close();
    }
}
