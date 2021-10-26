package Bruch;

class StartBruch {
    public static void main(String[] arg) {
        Bruch bruch = new Bruch(3, 5);
        Bruch brech = new Bruch(4, 5);
        Bruch brich = new Bruch(4, 7);

        brich = bruch.addition(brech);
        brich.ausgabeBruch();
    }
}
