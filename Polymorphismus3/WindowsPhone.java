package Polymorphismus3;

public class WindowsPhone extends Handy{
    private String hersteller;
    public WindowsPhone(float preis, String hersteller){
        super(preis);
        this.hersteller = hersteller;
    }
}
