package ALernen;

public class EndlessRecursion {
    public static void main(String[] args) {
        down(10);
    }

    static void down(int n) {
        System.out.print(n + ", ");
        down(n - 1);
    }
}
