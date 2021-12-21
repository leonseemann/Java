package Zeit;

import java.util.Scanner;

public class Zeit {
    private int stunde, minute;

    public Zeit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Stunde: ");
        int stunde = scanner.nextInt();

        System.out.print("Minute: ");
        int minute = scanner.nextInt();

        scanner.close();
        if (minute > 59) {
            stunde += minute / 60;
            this.minute = minute % 60;
        } else if (minute < 0) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }

        if (stunde > 23) {
            this.stunde = stunde % 24;
        } else if (stunde < 0) {
            this.stunde = 0;
        } else {
            this.stunde = stunde;
        }

    }

    public void setStunde(int stunde) {
        this.stunde = stunde;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getStunde() {
        return stunde;
    }

    public int getMinute() {
        return minute;
    }

    public void print() {
        System.out.printf("%s:%s", this.stunde, this.minute);
    }
}
