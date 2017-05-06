package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPSPeli {

    protected Scanner scanner;
    protected Tuomari tuomari;
    protected Tekoaly tekoaly;

    public KPSPeli(Scanner scanner, Tuomari tuomari, Tekoaly tekoaly) {
        this.scanner = scanner;
        this.tuomari = tuomari;
        this.tekoaly = tekoaly;
    }

    public void pelaa() {
        String ekanSiirto;
        String tokanSiirto;

        do {
            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = scanner.nextLine();

            tokanSiirto = toisenPelaajanSiirto(ekanSiirto);

            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari + "\n");
        } while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto));

        System.out.println("\nKiitos!");
        System.out.println(tuomari);
    }

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    protected abstract String toisenPelaajanSiirto(String siirto);
}
