package GOK;

public class GOK {
    private int wert1, wert2;

    public GOK() {
        this(1);
    }

    public GOK(int wert1) {
        this(wert1, 2);
    }

    public GOK(int wert1, int wert2) {
        this.wert1 = wert1;
        this.wert2 = wert2;
    }

    public void setWert1(int wert1) {
        this.wert1 = wert1;
    }

    public int getWert1() {
        return wert1;
    }

    public void setWert2(int wert2) {
        this.wert2 = wert2;
    }

    public int getWert2() {
        return wert2;
    }

    public void getGOK() {
        if (wert1 < wert2) {
            System.out.printf("%s ist groeßer als %s.", wert2, wert1);
        } else if (wert1 > wert2) {
            System.out.printf("%s ist groeßer als %s.", wert1, wert2);
        } else {
            System.out.printf("%s und %s sind gleich groß.", wert1, wert2);
        }
    }
}
