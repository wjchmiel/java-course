package com.chmielowiec.lecture42;

import java.io.*;


public class App1 {

    public static void main(String[] args) {

        String fileName = "test.txt";

        File textFile = new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file " + textFile.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file " + textFile.toString());
        }


    }
}
