

public class Scope {
    public static void main(String[] args) {
        int foo = 0;

        {
            int bar = 0; // bar gilt nur in diesem Block
            System.out.println(bar);
            System.out.println(foo);

            double foo = 0.0; // inline Fehler: Duplicate local variable foo
        }

        System.out.println(foo);
        System.out.println(bar); // inline Fehler: bar cannot be resolved
    }

    static void qux() {
        int foo, baz; // foo hat nichts mit foo aus main() zu tun

        {
            int baz; // inline Fehler: Duplicate local variable baz
        }
    }
}
