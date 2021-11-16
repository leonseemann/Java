package Vererbung.Mitarbeiter;

public class Gehaltsabrechnung {
    public static void main(String[] args) {
        double gesamt;

        Arbeiter leon = new Arbeiter();

        System.out.println("\033[H\033[2J");

        Arbeiter enes = new Arbeiter();

        System.out.println("\033[H\033[2J");

        Angestellter felix = new Angestellter();

        System.out.println("\033[H\033[2J");

        leon.ausgabeDaten();

        System.out.println("\n");

        enes.ausgabeDaten();;

        System.out.println("\n");

        felix.ausgabeDaten();

        System.out.println("\n");

        gesamt = leon.monatsBrutto() + enes.monatsBrutto() + felix.monatsBrutto();

        System.out.printf("Gehaltsausgaben insgesammt: %s", gesamt);
    }
}
