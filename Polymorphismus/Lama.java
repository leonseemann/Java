package Polymorphismus;

public class Lama extends Kamel{
    public void trageLast(){
        System.out.println("flatsch");
        super.trageLast();
        System.out.println("flatsch");
    }
}
