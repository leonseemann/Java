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

        if (minute > 59) {
            stunde++;
            this.minute = minute % 60;
        } else {
            this.minute = minute;
        }

        if (stunde > 23) {
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
