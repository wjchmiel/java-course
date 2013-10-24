package com.chmielowiec.lecture42;


import java.io.*;


public class App {

    public static void main(String[] args) {

        String fileName = "test.txt";

        File textFile = new File(fileName);
        BufferedReader bufferedReader = null;

        try {
            FileReader fileReader = new FileReader(textFile);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + textFile.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + textFile.toString());
        } finally {
            //System.out.println("'Finally block' is always executed!");

            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Unable to close file: " + textFile.toString());
                }

            }
        }

    }

}
