package ohtu.kivipaperisakset;

import java.util.HashMap;
import java.util.Scanner;

public class Pelitehdas {

    private static HashMap<String, KPSPeli> pelimuodot;

    public Pelitehdas() {
        pelimuodot = new HashMap<String, KPSPeli>();
        pelimuodot.put("a", new KPSPelaajaVsPelaaja(new Scanner(System.in), new Tuomari()));
        pelimuodot.put("b", new KPSTekoaly(new Scanner(System.in), new Tuomari(), new TekoalyHelppo()));
        pelimuodot.put("c", new KPSParempiTekoaly(new Scanner(System.in), new Tuomari(), new TekoalyParannettu(20)));
    }

    public static KPSPeli hae(String s) {
        KPSPeli peli = pelimuodot.get(s);
        if (peli == null) {
            return null;
        }
        return peli;
    }
}
