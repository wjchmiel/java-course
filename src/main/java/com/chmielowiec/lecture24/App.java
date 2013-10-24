package com.chmielowiec.lecture24;


public class App {

    public static void main(String[] args) {

        StringBuilder tekst = new StringBuilder();

        tekst.append("Nazywam się Bob.").append(" ").append(" ");
        tekst.append(" ");
        tekst.append("Jestem budowniczym.");

        System.out.println(tekst.toString());

        System.out.print("To jest jakiś tekst.\tTu wstawiono tabulację.\nA tu nową linię.\n");


        Object obj = new Object();
        String txt = obj.toString();
        System.out.println(txt);

    }

}
