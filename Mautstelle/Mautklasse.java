package Mautstelle;

class Mautklasse {

    private int Anzahl;
    private float Geldmenge;

    public Mautklasse() {
        this(0);
    }

    public Mautklasse(int a) {
        this(a, 0);
    }

    public Mautklasse(int a, int g) {
        Anzahl = a;
        Geldmenge = g;
    }

    public void lkwbezahlt() {
        Anzahl += 1;
        Geldmenge += 2.5;
    }

    public void pkwbezahlt() {
        Anzahl += 1;
        Geldmenge += 1;
    }

    public void ausgabe() {
        System.out.println("Anzahl der Fahrzeuge:" + Anzahl + "\n" + "Summe:" + Geldmenge + "\n");
    }
}
