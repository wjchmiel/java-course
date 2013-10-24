package com.chmielowiec.lecture23;

class Rzecz {
    private String nazwa;
    private static String opis;
    private static int licznik = 0;
    private static final int NUMER_KLASY = 5;

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Rzecz() {
        System.out.println("Uruchmiony konstruktor Rzecz()");
        //zwiększ licznik
        licznik++;
    }

    public Rzecz(String opis) {
        System.out.println("Uruchmiony konstruktor Rzecz(String opis)");
        this.opis = opis;
        //zwiększ licznik
        licznik++;
    }

    public static String getOpis() {
        return opis;
    }

    public static final int getNumerKlasy() {
        return NUMER_KLASY;
    }

    public static int getLicznik() {
        return licznik;
    }

    public String toString() {
        StringBuilder napis = new StringBuilder();
        napis.append(nazwa).append(", ").append(opis).append(", ").append(licznik);
        return napis.toString();
    }

}


public class App {

    public static void main(String[] args) {

        System.out.println("Przed utowrzeniem obiektów licznik = " + Rzecz.getLicznik());

        Rzecz rzecz3 = new Rzecz();
        System.out.println("Nazwa: " + rzecz3.getNazwa());
        System.out.println("Opis: " + Rzecz.getOpis() + ", ID klasy: " + Rzecz.getNumerKlasy());

        Rzecz rzecz1 = new Rzecz("Definiujemy pole 'opis' typu static String");
        Rzecz rzecz2 = new Rzecz();

        System.out.println("Po utowrzeniem obiektów licznik = " + Rzecz.getLicznik());

        rzecz1.setNazwa("krzesło");

        System.out.println("Nazwa: " + rzecz1.getNazwa());
        System.out.println("Opis: " + Rzecz.getOpis() + ", ID klasy: " + Rzecz.getNumerKlasy());


        rzecz2.setNazwa("stół");

        System.out.println("Nazwa: " + rzecz2.getNazwa());
        System.out.println("Opis: " + Rzecz.getOpis() + ", ID klasy: " + Rzecz.getNumerKlasy());

        System.out.println("rzecz1: " + rzecz1);
        System.out.println("rzecz2: " + rzecz2);
        System.out.println("rzecz3: " + rzecz3);


    }
}
