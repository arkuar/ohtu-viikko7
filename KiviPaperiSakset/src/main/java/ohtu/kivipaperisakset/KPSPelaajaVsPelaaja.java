package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPSPeli {

    public KPSPelaajaVsPelaaja(Scanner scanner, Tuomari tuomari) {
        super(scanner, tuomari, null);
    }

    @Override
    protected String toisenPelaajanSiirto(String siirto) {
        System.out.print("\nToisen pelaajan siirto: ");
        return scanner.nextLine();
    }

}
