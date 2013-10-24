package com.chmielowiec.lecture20;

class Robot {
    public void mówi(String tekst) {
        System.out.println(tekst);
    }

    public void skacze(double wysokość) {
        System.out.println("Skacze na wysokość " + wysokość);
    }

    public void ruch(String kierunek, double odległość) {
        System.out.println("Poruszył się o " + odległość + " w kierunku " + kierunek);
    }
}

public class App {

    public static void main(String[] args) {

        Robot joe = new Robot();

        joe.mówi("Cześć! Jestem robot joe");
        joe.skacze(1.42);
        joe.ruch("W", 54.4);

    }
}
