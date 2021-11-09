package Vererbung.Mitarbeiter;


public class Gehaltsberechnung {
    public static void main(String[] args) {
        Arbeiter leon = new Arbeiter();
        Angestellter felix = new Angestellter();

        System.out.println("\033[H\033[2J");

        leon.ausgabeDaten();

        System.out.println("\n");

        felix.ausgabeDaten();
    }
}
