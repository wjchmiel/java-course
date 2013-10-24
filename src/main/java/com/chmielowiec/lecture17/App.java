package com.chmielowiec.lecture17;

class Osoba {
    String imię;
    int wiek;
    long id;

    void mówi() {
        System.out.println("Mam na imię " + imię + " i mam " + wiek + " lata.");
    }

    int lataDoEmertury() {
        int lata = 67 - wiek;
        return wiek;
    }
}


public class App {

    public static void main(String[] args) {

        Osoba osoba1 = new Osoba();

        osoba1.imię = "Witek";
        osoba1.wiek = 2;
        osoba1.id = 23032433;
        osoba1.mówi();
        System.out.println("Lata do emerytury: " + osoba1.lataDoEmertury());

        Osoba osoba2 = new Osoba();

        osoba2.imię = "Mietek";
        osoba2.wiek = 52;
        osoba2.id = 565632433;
        osoba2.mówi();

        System.out.println("ID: " + osoba1.id);
    }

}
