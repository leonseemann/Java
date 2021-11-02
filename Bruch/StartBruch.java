package Bruch;

class StartBruch {
    public static void main(String[] arg) {
        Bruch a = new Bruch(1, 3);
        Bruch b = new Bruch(1, 2);
        Bruch c = new Bruch();

        c = a.addition(b);
        c.ausgabeBruch();
        System.out.println(c.ausgabeDezimal());
    }
}
