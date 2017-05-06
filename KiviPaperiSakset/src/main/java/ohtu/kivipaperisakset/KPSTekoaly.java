package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends KPSPeli {

    public KPSTekoaly(Scanner scanner, Tuomari tuomari, Tekoaly tekoaly) {
        super(scanner, tuomari, tekoaly);
    }

    @Override
    protected String toisenPelaajanSiirto(String siirto) {
        String tehtySiirto = tekoaly.annaSiirto();
        System.out.println("\nTietokone valitsi: " + tehtySiirto);
        return tehtySiirto;
    }

}
