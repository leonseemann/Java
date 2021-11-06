package Game;

import java.util.Scanner;

public class main extends zehntausend {
    public static void main(String[] args) {

        int pick = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl der Spieler");
        int anzahl_spieler = scanner.nextInt();

        // Neues Array Objekt
        Player[] player = new Player[anzahl_spieler];

        // Schleife zum Erstellen der Spieler
        for (int i = 0; i < anzahl_spieler; i++) {
            System.out.println("Name:");
            player[i] = new Player(scanner.next());
            System.out.println("\n");
        }
        for (int i = 0; i < anzahl_spieler; i++) {
            System.out.printf("Spieler:  %s%nPunkte: %s%n%n", player[i].getName(), player[i].getPoints());
        }

        while (true) {

            System.out.println("Was hast du gewürfelt?");
            System.out.printf(
                    "1. Eine 5. %n2. Eine 1. %n3. 3 mal eine 2 %n4. 3 mal eine 3 %n5. 3 mal eine 4 %n6. 3 mal eine 5%n7. 3 mal eine 6 %n8. Eine Straße%n");
            int i = scanner.nextInt();
            switch (i) {
            case 1:
                fuenf(player[pick]);
                break;
            case 2:
                eins(player[pick]);
                break;
            case 3:
                dreimalzwei(player[pick]);
                break;
            case 4:
                dreimaldrei(player[pick]);
                break;
            case 5:
                dreimalvier(player[pick]);
                break;
            case 6:
                dreimalfuenf(player[pick]);
                break;
            case 7:
                dreimalsechs(player[pick]);
                break;
            case 8:
                strasse(player[pick]);
                break;

            default:
                System.out.printf("%s ist eine ungueltige Eingabe.", i);
                return;
            }
            System.out.printf("Spieler:  %s%nPunkte: %s%n%n", player[pick].getName(), player[pick].getPoints());
        }

    }
}
