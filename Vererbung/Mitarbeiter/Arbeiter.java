package Vererbung.Mitarbeiter;

import java.util.Scanner;

public class Arbeiter extends Mitarbeiter {
    private double stundenlohn, schichtzulage;
    private int anzahlstunden;

    public Arbeiter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name:");
        this.setName(scanner.next());
        System.out.println("PersNr:");
        this.setPersnr(scanner.nextInt());
        System.out.println("Stundenlohn:");
        this.stundenlohn = scanner.nextDouble();
        System.out.println("Schichtzulage:");
        this.schichtzulage = scanner.nextDouble();
        System.out.println("Anzahlstunden:");
        this.anzahlstunden = scanner.nextInt();
    }

    public Arbeiter(String name, int persnr, double stundenlohn, double schichtzulage, int anzahlstunden) {
        super(name, persnr);
        this.stundenlohn = stundenlohn;
        this.schichtzulage = schichtzulage;
        this.anzahlstunden = anzahlstunden;
    }

    public void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    public double getStundenlohn() {
        return this.stundenlohn;
    }

    public void setSchichtzulage(double schichtzulage) {
        this.schichtzulage = schichtzulage;
    }

    public double getSchichtzulage() {
        return this.schichtzulage;
    }

    public void setAnzahlstunden(int anzahlstunden) {
        this.anzahlstunden = anzahlstunden;
    }

    public int getAnzahlstunden() {
        return this.anzahlstunden;
    }

    public double monatsBrutto() {
        return this.stundenlohn * this.anzahlstunden + this.schichtzulage;
    }

    public void ausgabeDaten() {
        System.out.printf("Name: %s%nPersNr: %s%nMonatsbruttolohn: %s%n", this.getName(), this.getPersnr(),
        this.monatsBrutto());
    }
}
