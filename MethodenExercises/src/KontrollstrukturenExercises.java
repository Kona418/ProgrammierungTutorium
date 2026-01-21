package src;

// EXERCISES – KONTROLLSTRUKTUREN
public class KontrollstrukturenExercises {

    public static void main(String[] args) {

        // AUFGABE 1:
        // - Schreibe eine Methode "istPositiv".
        // - Parameter: eine ganze Zahl.
        // - Ausgabe:
        //   * "Zahl ist positiv"
        //   * "Zahl ist negativ"
        //   * "Zahl ist null"
        istPositiv(10);
        istPositiv(-5);
        istPositiv(0);


        // AUFGABE 2:
        // - Schreibe eine Methode "istGerade".
        // - Parameter: eine ganze Zahl.
        // - Ausgabe: "gerade" oder "ungerade".
        istGerade(4);
        istGerade(7);


        // AUFGABE 3:
        // - Schreibe eine Methode "noteBewerten".
        // - Parameter: note (int von 1–6).
        // - Ausgabe mit if/else:
        //   1–2 → "sehr gut / gut"
        //   3–4 → "befriedigend / ausreichend"
        //   5–6 → "nicht bestanden"
        noteBewerten(2);
        noteBewerten(4);
        noteBewerten(6);


        // AUFGABE 4:
        // - Schreibe eine Methode "zugangErlaubt".
        // - Parameter:
        //   * alter (int)
        //   * hatAusweis (boolean)
        // - Zugang erlaubt, wenn:
        //   * alter >= 18 UND hatAusweis == true
        zugangErlaubt(20, true);
        zugangErlaubt(16, true);


        // AUFGABE 5:
        // - Schreibe eine Methode "rabattBerechnen".
        // - Parameter: preis (double).
        // - Wenn preis >= 100 → 10% Rabatt
        // - Sonst kein Rabatt
        // - Ausgabe des Endpreises
        rabattBerechnen(150.0);
        rabattBerechnen(50.0);


        // ======================================
        // SWITCH / CASE
        // ======================================

        // AUFGABE 6:
        // - Schreibe eine Methode "wochentagName".
        // - Parameter: tag (int von 1–7).
        // - Verwende switch/case.
        // - Ausgabe: Name des Wochentags.
        wochentagName(1);
        wochentagName(5);
        wochentagName(7);


        // AUFGABE 7:
        // - Schreibe eine Methode "studiengangName".
        // - Parameter: studiengangCode (char).
        // - switch/case:
        //   'I' → Informatik
        //   'B' → BWL
        //   'M' → Maschinenbau
        //   default → Unbekannt
        studiengangName('I');
        studiengangName('B');
        studiengangName('X');


        // AUFGABE 8:
        // - Schreibe eine Methode "ampelStatus".
        // - Parameter: farbe (String).
        // - switch/case:
        //   "rot" → "Stopp"
        //   "gelb" → "Achtung"
        //   "grün" → "Fahren"
        ampelStatus("rot");
        ampelStatus("grün");


        // ======================================
        // KOMBINATIONSAUFGABEN
        // ======================================

        // Kombi-AUFGABE 9:
        // - Schreibe eine Methode "pruefeStudent".
        // - Parameter:
        //   * alter (int)
        //   * eingeschrieben (boolean)
        // - Ausgabe:
        //   * "Student volljährig"
        //   * "Student minderjährig"
        //   * "Keine Einschreibung"
        pruefeStudent(22, true);
        pruefeStudent(17, true);
        pruefeStudent(25, false);


        // Kombi-AUFGABE 10:
        // - Schreibe eine Methode "kategoriePreis".
        // - Parameter:
        //   * kategorie (char)
        //   * grundpreis (double)
        // - switch/case:
        //   'A' → +0€
        //   'B' → +10€
        //   'C' → +20€
        // - Ausgabe des Endpreises
        kategoriePreis('A', 50.0);
        kategoriePreis('C', 50.0);


        // BONUS-AUFGABE 11 zum TERNARY OPERATOR:
        // - Schreibe eine Methode "bewerteAlterKurz".
        // - Parameter: alter (int)
        // - Rückgabe: String
        //     * "volljährig" wenn alter >= 18
        //     * sonst "minderjährig"
        // - Verwende den ternary operator! Die Methode enthält nur eine Zeile Code.
        String alter1 = getAltersangabe(20);
        String alter2 = getAltersangabe(15);

        System.out.println("Person 1 ist + " + alter1);
        System.out.println("Person 2 ist + " + alter2);


        // BONUS-AUFGABE 12 zum TERNARY OPERATOR:
        // - Schreibe eine Methode "ticketStatus".
        // - Parameter:
        //   * hatTicket (boolean)
        // - Verwende den ternary operator! Die Methode hat nur eine Zeile Code.
        // - Die Methode soll folgendes in der Konsole ausgeben:
        //   * "Ticket vorhanden" wenn true
        //   * "Kein Ticket" wenn false
        ticketStatus(true);
        ticketStatus(false);
    }


    // =====================
    // METHODEN
    // =====================



}