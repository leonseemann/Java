package Moebel;

public class Stuhl extends moebel{
    private double rabattsatz;

    public Stuhl(){
        this(50);
    }

    public Stuhl(int anzahl){
        this(anzahl, 25.0);
    }

    public Stuhl(int anzahl, double rabattsatz){
        this(anzahl, rabattsatz, 100.0);
    }

    public Stuhl(int anzahl, double rabattsatz, double preis){
        this(anzahl, rabattsatz, preis, "Stuhl");
    }

    public Stuhl(int anzahl, double rabattsatz, double preis, String bezeichnung) {
        this.setAnzahlAufLager(anzahl);
        this.setPreis(preis);
        this.setBezeichnung(bezeichnung);
        this.rabattsatz = rabattsatz;
    }

    public void verkaufen(int anzahl){
        if(this.getAnzahlAufLager() < anzahl){
            System.err.println("Nicht genuegend Stuehle vorhanden!");
        } else {
            this.setAnzahlAufLager(this.getAnzahlAufLager() - anzahl);          
            System.out.printf("Rabatt: %s Euro%nAnzahl noch auf Lager: %s", berechneRabatt(anzahl), this.getAnzahlAufLager());  
        }
    }

    public double berechneRabatt(int anzahl){
        double rabatt = anzahl * this.getPreis() * rabattsatz/100;
        return rabatt;
    }
}
