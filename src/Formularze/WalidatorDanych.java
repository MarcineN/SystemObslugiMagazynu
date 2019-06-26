/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularze;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Marcin
 */
/*
    Tryb1 - Cyfry
    Tryb2 - Cyfry double
    Tryb3 - Litery 
    Tryb4 - Litery + cyfry
    Tryb5 - Data
    Tryb6 - Kod pocztowy
    Tryb7 - NIP
    Tryb8 - Tylko długość
 */
public class WalidatorDanych {

    private static String znalezioneBledy = "";
    private static String wzorLitery = "[\\p{IsAlphabetic}\\s]+"; // +spacje
    private static String wzorLiteryLiczby = "[\\p{IsAlphabetic}\\s\\d]+"; // +spacje
    private static String wzorKodPoczt = "[0-9]{2}\\-[0-9]{3}";
    private static String wzorNip = "[0-9]{3}\\-[0-9]{3}\\-[0-9]{2}\\-[0-9]{2}";

    public int sprawdz(String nazwa, String zmienna, int tryb, int dlugosc) {

        if (zmienna.equals("")) {
            dodajBlad(nazwa, "nie może buć puste!");
            return 0;
        } else if (zmienna.length() > dlugosc) {
            dodajBlad(nazwa, "jest zbyt dlugie! Max. " + dlugosc + " znaków!");
            return 0;
        } else {
            switch (tryb) {
                case 1:
                    if (!czyLiczbaCalkowita(zmienna)) {
                        dodajBlad(nazwa, "musi byc typu calkowitego!");
                        return 0;
                    }
                    break;
                case 2:
                    if (!czyLiczbaDouble(zmienna)) {
                        dodajBlad(nazwa, "musi byc typu calkowitego lub zmiennoprzecinkowego!");
                    }
                    break;
                case 3:
                    if (!zmienna.matches(wzorLitery)) {
                        dodajBlad(nazwa, "moze zawierac tylko litery!");
                        return 0;
                    }
                    break;
                case 4:
                    if (!zmienna.matches(wzorLiteryLiczby)) {
                        dodajBlad(nazwa, "moze zawierac tylko litery i liczby!");
                        return 0;
                    }
                    break;
                case 5:
                    if (!czyDobraData(zmienna)) {
                        dodajBlad(nazwa, "jest niewłaściwa (RRRR-MM-DD)!");
                        return 0;
                    }
                    break;
                case 6:
                    if (!zmienna.matches(wzorKodPoczt)) {
                        dodajBlad(nazwa, "jest niewłaściwy (NN-NNN)!");
                        return 0;
                    }
                    break;
                case 7:
                    if (!zmienna.matches(wzorNip)) {
                        dodajBlad(nazwa, "jest niewłaściwiy (AAA-AAA-AA-AA) !");
                        return 0;
                    }
                    break;
                case 8:
                    // Pusto bo sprawdzamy tylko długość
                    break;
            }
            return 0;
        }
    }

    private static void dodajBlad(String nazwa, String kom) {
        znalezioneBledy += "Pole " +nazwa + " " + kom + "\n";
    }

    public String getZnalezioneBledy() {
        return znalezioneBledy;
    }

    public static void usunBledy() {
        znalezioneBledy = "";
    }

    public boolean czyDobraData(String s) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false); // bardziej restrykcyjne sprawdzanie
        if (s.equals("0000-00-00")) { // dopuszczam datę "zerową" jako brak precyzji wydania
            return true;
        }
        try {
            format.parse(s);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    private static boolean czyLiczbaCalkowita(String s) {
        try {
            Integer t = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static boolean czyLiczbaDouble(String s) {
        try {
            Double t = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
