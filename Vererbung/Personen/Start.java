package Vererbung.Personen;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Eingabe: Name, Vorname, Klasse");
		
		Schueler leon = new Schueler(scanner.next(), scanner.next(), scanner.next());

		leon.print();
		
		System.out.println("\n");
		
		System.out.println("Eingabe: Name, Vorname, Fache 1, Fach 2");
		
		Lehrer Schmidt = new Lehrer(scanner.next(), scanner.next(), scanner.next(), scanner.next());
		
		Schmidt.print();
		
		System.out.println("\n");

		System.out.println("Eingabe: Name, Vorname");

		Person p = new Person(scanner.next(), scanner.next());
		
		p.print();
	}

}
