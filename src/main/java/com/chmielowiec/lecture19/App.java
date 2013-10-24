package com.chmielowiec.lecture19;

class Kot {
    private String rasa;
    private String imię;
    private int wiek;

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getRasa() {
        return rasa;
    }

    public String getImię() {
        return imię;
    }

    public int getWiek() {
        return wiek;
    }

    public void setInfo(String imię, String rasa, int wiek) {
        setImię(imię);
        setRasa(rasa);
        setWiek(wiek);
    }

    public Kot(String imię, int wiek) {
        System.out.println("Konstruktor Kot(String imię, int wiek) uruchomiony!");
        this.imię = imię;
        this.wiek = wiek;
    }


    public Kot() {
        this("Garfild", 5);
        System.out.println("Konstruktor Kot() uruchomiony!");
    }

    public Kot(String imię) {
        System.out.println("Konstruktor Kot(String imię) uruchomiony!");
        this.imię = imię;
    }


}


public class App {

    public static void main(String[] args) {

        Kot kotek = new Kot();


        kotek.setImię("Puszek");
        kotek.setRasa("perski");
        kotek.setWiek(2);

        kotek.setInfo("Bury", "dachowiec", 1);

        System.out.println("Imię kota: " + kotek.getImię() + ", rasa: " + kotek.getRasa()
                + ", wiek: " + kotek.getWiek());

        Kot kot1 = new Kot();
        System.out.println("Imię kota: " + kot1.getImię() + ", rasa: " + kot1.getRasa()
                + ", wiek: " + kot1.getWiek());

        Kot kot2 = new Kot("Fifek");
        System.out.println("Imię kota: " + kot2.getImię() + ", rasa: " + kot2.getRasa()
                + ", wiek: " + kot2.getWiek());

        Kot kot3 = new Kot("Mruczek", 3);
        System.out.println("Imię kota: " + kot3.getImię() + ", rasa: " + kot3.getRasa()
                + ", wiek: " + kot3.getWiek());

    }

}
