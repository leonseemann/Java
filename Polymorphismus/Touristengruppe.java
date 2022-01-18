package Polymorphismus;

import java.util.ArrayList;

public class Touristengruppe {
    public static void main(String[] args) {
        ArrayList<Lasttiere> arrayTiere = new ArrayList<>();
        arrayTiere.add(new Lama());
        arrayTiere.add(new Dromedar());
        arrayTiere.add(new Dromedar());
        arrayTiere.add(new Trampeltiere());
        arrayTiere.add(new Trampeltiere());
        arrayTiere.add(new Trampeltiere());
        
        for (int i = 0; i < arrayTiere.size(); i++) {
            ausgabe(arrayTiere.get(i));
        }
    }

    public static void ausgabe(Lasttiere x){
        x.trageLast();
        System.out.print("\n");
    }
}
