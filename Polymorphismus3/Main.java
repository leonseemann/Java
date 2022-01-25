package Polymorphismus3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Handy> handys = new ArrayList<>();
        handys.add(new WindowsPhone(150.00F, "Samsung"));
        handys.add(new WindowsPhone(156.00F, "OnePlus"));
        handys.add(new IPhone(200.00F));
        handys.add(new IPhone(200.00F));
        handys.add(new AndroidPhone(160.00F, "Huawai"));
        handys.add(new AndroidPhone(170.00F, "Xiaomi"));
        handys.add(new Handy(140.00F));
        handys.add(new Handy(130.00F));

        for(Handy i : handys){
            if(i instanceof WindowsPhone || i instanceof IPhone) {
                System.out.println("AUSVERKAUFT");
            } else {
                System.out.println(i.toString());
            }
        }
    }
}
