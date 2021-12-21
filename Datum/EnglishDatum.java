package Datum;

public class EnglishDatum extends Datum {

    public EnglishDatum() {
        super();
    }

    public EnglishDatum(int tag, int monat, int jahr) {
        super(tag, monat, jahr);
    }

    public void ausgabeDaten() {
        System.out.printf("%s-%s-%s", this.jahr, this.monat, this.tag);
    }
}
