package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Pelitehdas PELITEHDAS = new Pelitehdas();

    public static void main(String[] args) {

        while (true) {
            aloitusViesti();
            String vastaus = SCANNER.nextLine();
            KPSPeli p = PELITEHDAS.hae(vastaus);
            if (p == null) {
                break;
            }
            System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
            p.pelaa();
        }

    }

    private static void aloitusViesti() {
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");
    }
}
