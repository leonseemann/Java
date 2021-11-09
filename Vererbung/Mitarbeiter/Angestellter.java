package Vererbung.Mitarbeiter;

import java.util.Scanner;

public class Angestellter extends Mitarbeiter {
    private double grundgehalt, ortzuschlag;

    public Angestellter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name:");
        this.setName(scanner.next());
        System.out.println("PersNr:");
        this.setPersnr(scanner.nextInt());
        System.out.println("Grundgehalt:");
        this.grundgehalt = scanner.nextDouble();
        System.out.println("Ortzuschlag:");
        this.ortzuschlag = scanner.nextDouble();
    }

    public double monatsBrutto() {
        return this.grundgehalt + this.ortzuschlag;
    }

    public void ausgabeDaten() {
        System.out.printf("Name: %s%nPersNr: %s%nMonatsbruttolohn: %s%n", this.getName(), this.getPersnr(),
                this.monatsBrutto());
    }
}
