package Polymorphismus4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> tiere = new ArrayList<>();
        tiere.add(new Fox("FuchsEins"));
        tiere.add(new Fox("FuchsZwei"));
        tiere.add(new Rabbit("HaseEins"));
        tiere.add(new Rabbit("HaseZwei"));

        for(Animal i : tiere){
            if (i instanceof Fox){
                ((Fox) i).hunt();
            }
            if (i instanceof Rabbit){
                ((Rabbit) i).flee();
            }
        }
    }
}
