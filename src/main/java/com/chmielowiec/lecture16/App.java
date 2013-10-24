package com.chmielowiec.lecture16;

public class App {

    public static void main(String[] args) {

        int[][] tab = {
                {2, 42, 53},
                {12, 523},
                {4242, 634, 75, 5}
        };
        System.out.println(tab[0][2]);

        for (int j = 0; j < tab.length; j++) {
            for (int k = 0; k < tab[j].length; k++) {
                System.out.print(tab[j][k] + "\t\t");
            }
            System.out.println();
        }

    }
}
