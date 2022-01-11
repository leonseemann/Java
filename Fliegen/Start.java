package Fliegen;

public class Start {
    public static void main(String[] args) {
        Hummel maja = new Hummel();
        abflug(maja);
    }
    public static void abflug(Fliegen x){
        x.fliegen();
    }
}
