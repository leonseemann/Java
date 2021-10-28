package ALernen;

public class Quadrat {
    static int quadrat(int n) {
        return n * n;
    }

    static void ausgabe(int n) {
        for (int i = 1; i <= n; i++) {
            String s = "Quadrat (" + i + ") = " + quadrat(i);
            System.out.println(s);
        }
    }

    public static void main(String[] arg) {
        ausgabe(6);
    }
}
