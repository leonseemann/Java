package Datum;

public class Datum implements interfaceDatum {
    int tag, monat, jahr;

    public Datum() {
        this(14);
    }

    public Datum(int tag) {
        this(tag, 8);
    }

    public Datum(int tag, int monat) {
        this(tag, monat, 2004);
    }

    public Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public void ausgabeDaten() {
        System.out.printf("%s.%s.%s", this.tag, this.monat, this.jahr);
    }
}
