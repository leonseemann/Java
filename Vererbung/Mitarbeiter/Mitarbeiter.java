package Vererbung.Mitarbeiter;

import java.util.Scanner;

public class Mitarbeiter {

    private String name;
    private int persnr;

    public Mitarbeiter() {
        this("Leer");
    }

    public Mitarbeiter(String name) {
        this(name, 0);
    }

    public Mitarbeiter(int persnr) {
        this("Leer", persnr);
    }

    public Mitarbeiter(String name, int persnr) {
        this.name = name;
        this.persnr = persnr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPersnr(int persnr) {
        this.persnr = persnr;
    }

    public int getPersnr() {
        return this.persnr;
    }

    public void ausgabeDaten() {
        System.out.printf("Name: %s%nPersNr: %s%n", name, persnr);
    }
}
