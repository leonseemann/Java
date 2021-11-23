package Zeit;

import java.util.Scanner;

public class Zeit {
    private int stunde, minute;

    public Zeit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Stunde: ");
        this.stunde = scanner.nextInt();

        System.out.print("Minute: ");
        this.minute = scanner.nextInt();     
    }


    public void setStunde(int Stunde) {
        this.stunde = Stunde;
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
