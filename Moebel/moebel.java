package Moebel;

abstract class moebel {
    private String bezeichnung;
    private double preis;
    private int anzahlAufLager;

    public moebel(String bezeichnung, double preis, int anzahlAufLager){
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.anzahlAufLager = anzahlAufLager;
    }

    public abstract double berechneRabatt(int anzahl);

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getPreis() {
        return preis;
    }

    public void setAnzahlAufLager(int anzahlAufLager) {
        this.anzahlAufLager = anzahlAufLager;
    }

    public int getAnzahlAufLager() {
        return anzahlAufLager;
    }
}
