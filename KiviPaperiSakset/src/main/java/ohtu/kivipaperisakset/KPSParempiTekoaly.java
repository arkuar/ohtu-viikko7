package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPSPeli {

    public KPSParempiTekoaly(Scanner scanner, Tuomari tuomari, Tekoaly tekoaly) {
        super(scanner, tuomari, tekoaly);
    }

    @Override
    protected String toisenPelaajanSiirto(String siirto) {
        String tehtySiirto = tekoaly.annaSiirto();
        System.out.println("\nTietokone valitsi: " + tehtySiirto);
        tekoaly.asetaSiirto(siirto);
        return tehtySiirto;
    }

}
