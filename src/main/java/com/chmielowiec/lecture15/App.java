package com.chmielowiec.lecture15;


public class App {

    public static void main(String[] args) {
        int[] tablica = new int[10];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i * i;
            System.out.printf("%d, ", tablica[i]);
        }

        String[] imiona = new String[5];
        imiona[0] = "Witek";
        imiona[1] = "Magda";
        imiona[2] = "Oluś";
        imiona[3] = "Wojtuś";

        for (String imię : imiona) {
            System.out.println();
            System.out.printf("%s, ", imię);
        }

    }

}
