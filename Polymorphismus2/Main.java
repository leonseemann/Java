package Polymorphismus2;

public class Main {
    public static void main(String[] args) {
        Bildhauer x = new Bildhauer();
        setup(x);
    }

    static void setup(Kuenstler x){
        if(x instanceof Maler){
            ((Maler) x).male();
        }
        if(x instanceof Musiker){
            ((Musiker) x).musiziere();
        }
        if(x instanceof Bildhauer) {
            /*
            Bildhauer bildhauer = (Bildhauer) x;
            bildhauer.haue();
            */
            ((Bildhauer) x).haue();
        }
    }
}
