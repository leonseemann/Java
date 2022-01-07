package Mitarbeiter;

public class Angestellter extends Mitarbeiter {
    private int grundgehalt, ortszuschlag;

    public Angestellter(String name, int persnr, int grundgehalt, int ortszuschlag) {
        super(name, persnr);
        this.grundgehalt = grundgehalt;
        this.ortszuschlag = ortszuschlag;
    }

    public double monatsBrutto() {
        return grundgehalt + ortszuschlag;
    }
}
