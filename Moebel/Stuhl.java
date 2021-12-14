package Moebel;

public class Stuhl extends moebel{
    private double rabattsatz;

    public Stuhl(){
        this(50);
    }

    public Stuhl(int anzahlAufLager){
        this(anzahlAufLager, 25.0);
    }

    public Stuhl(int anzahlAufLager, double rabattsatz){
        this(anzahlAufLager, rabattsatz, 100.0);
    }

    public Stuhl(int anzahlAufLager, double rabattsatz, double preis){
        this(anzahlAufLager, rabattsatz, preis, "Stuhl");
    }

    public Stuhl(int anzahlAufLager, double rabattsatz, double preis, String bezeichnung) {
        super(bezeichnung, preis, anzahlAufLager);
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
