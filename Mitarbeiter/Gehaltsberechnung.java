package Mitarbeiter;

public class Gehaltsberechnung {
    public static void main(String[] args) {
        Mitarbeiter m1 = new Arbeiter("Leon", 0, 15, 25, 45);
        Mitarbeiter m2 = new Angestellter("Justus", 1, 2500, 500);

        m1.ausgabeDaten();
        System.out.println(m1.monatsBrutto());

        m2.ausgabeDaten();
        System.out.println(m2.monatsBrutto());
    }
}
