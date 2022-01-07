package Mitarbeiter;

public class Arbeiter extends Mitarbeiter {
    private int stundenlohn, anzahlstunden, schichtzulage;

    public Arbeiter(String name, int persnr, int stundenlohn, int anzahlstunden, int schichtzulage){
        super(name, persnr);
        this.stundenlohn = stundenlohn;
        this.anzahlstunden = anzahlstunden;
        this.schichtzulage = schichtzulage;
    }

    public double monatsBrutto(){
        return stundenlohn * anzahlstunden + schichtzulage;
    }
}
