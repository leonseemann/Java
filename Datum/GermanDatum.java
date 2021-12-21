package Datum;

public class GermanDatum extends Datum {

    public GermanDatum() {
        super();
    }

    public GermanDatum(int tag, int monat, int jahr) {
        super(tag, monat, jahr);
    }

    public void ausgabeDaten() {
        System.out.printf("%s.%s.%s", this.tag, this.monat, this.jahr);
    }
}
