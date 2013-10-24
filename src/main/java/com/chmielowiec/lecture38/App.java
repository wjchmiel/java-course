package com.chmielowiec.lecture38;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class App {

    public static void main( String[] args ){

        System.out.println("Please, enter the file name: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();


        File textFile = new File(fileName);

        try {
            FileReader fr = new FileReader(textFile);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            System.out.println("File " + textFile.toString() + " not found");
        }

        System.out.println("Finished.");
    }

}
