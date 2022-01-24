package Generic;

public class StartGeneric {
    public static void main(String[] args) {
        Generic test = new Generic();

        test.<Integer>Test(25);
        test.<Character>Test('D');
        test.<String>Test("Dounut");
    }
}
