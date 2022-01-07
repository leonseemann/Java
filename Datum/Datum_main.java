package Datum;

public class Datum_main {
    public static void main(String[] args) {
        GermanDatum datum = new GermanDatum(14, 8, 2004);
        EnglishDatum date = new EnglishDatum();

        datum.ausgabeDaten();
        System.out.println();
        date.ausgabeDaten();
    }
}
