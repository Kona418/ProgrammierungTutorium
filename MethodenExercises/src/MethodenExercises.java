package src;

// EXERCISES – METHODEN
public class MethodenExercises {

    public static void main(String[] args) {

        // AUFGABE 1:
        // - Schreibe eine Methode "begruesse".
        // - Die Methode soll nichts zurückgeben.
        // - Sie soll einfach "Hallo <dein Name>!" ausgeben.
        begruesse();


        // AUFGABE 2:
        // - Schreibe eine Methode "gibZahlZurueck".
        // - Die Methode soll eine ganze Zahl zurückgeben.
        // - Gib z.B. die Zahl 42 zurück.
        int zahl = gibZahlZurueck();
        System.out.println("Zurückgegebene Zahl: " + zahl);


        // AUFGABE 3:
        // - Schreibe eine Methode "druckeName".
        // - Die Methode soll einen String als Parameter bekommen (name).
        // - Sie soll "Hallo <name>" ausgeben.
        druckeName("Name");


        // AUFGABE 4:
        // - Schreibe eine Methode "addiere".
        // - Die Methode soll zwei int-Parameter bekommen.
        // - Sie soll die Summe zurückgeben.
        int summe = addiere(5, 7);
        System.out.println("Summe: " + summe);


        // AUFGABE 5:
        // - Schreibe eine Methode "istVolljaehrig".
        // - Die Methode bekommt ein Alter (int).
        // - Sie gibt true zurück, wenn Alter >= 18 ist, sonst false.
        boolean volljaehrig = istVolljaehrig(20);
        System.out.println("Volljährig: " + volljaehrig);


        // AUFGABE 6:
        // - Schreibe eine Methode "druckeTemperatur".
        // - Parameter: temperatur (double).
        // - Ausgabe: "Die Temperatur beträgt X Grad."
        druckeTemperatur(21.5);


        // AUFGABE 7:
        // - Schreibe eine Methode "multipliziere".
        // - Parameter: zwei double-Werte.
        // - Rückgabewert: Produkt der beiden Zahlen.
        double produkt = multipliziere(2.5, 4.0);
        System.out.println("Produkt: " + produkt);


        // AUFGABE 8:
        // - Schreibe eine Methode "gibInitial".
        // - Parameter: String name.
        // - Rückgabe: der erste Buchstabe des Namens (char).
        char initial = gibInitial("Anna");
        System.out.println("Initial: " + initial);


        // ======================================
        // KOMBINATIONSAUFGABEN (etwas schwerer)
        // ======================================

        // Kombi-AUFGABE 9:
        // - Schreibe eine Methode "printStudentenInfo".
        // - Parameter:
        //   * name (String)
        //   * matrikelnummer (int)
        //   * eingeschrieben (boolean)
        // - Die Methode soll alle Infos sauber ausgeben.
        printStudentenInfo("Schöner Name", 12345, true);


        // Kombi-AUFGABE 10:
        // - Schreibe eine Methode "berechnePreisOhneMwSt".
        // - Parameter: preis (double)
        // - Rückgabe: Netto Preis abzüglich der 19% MwSt
        double endpreis = berechnePreisOhneMwSt(100.0);
        System.out.println("Netto Preis ohne MwSt: " + endpreis + "€");
    }


    // =====================
    // METHODEN
    // =====================
}