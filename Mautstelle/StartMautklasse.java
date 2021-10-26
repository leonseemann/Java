package Mautstelle;

import java.util.Scanner;

class StartMautklasse {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        Mautklasse Maut = new Mautklasse();

        while (true) {
            String i = scanner.next();

            switch (i) {

            case "p":
                Maut.pkwbezahlt();
                break;

            case "l":
                Maut.lkwbezahlt();
                break;

            case "e":
                Maut.ausgabe();
                break;

            default:
                System.out.println("Ungueltige Eingabe");
                break;
            }
        }
    }
}
