package Polymorphismus3;

public class AndroidPhone extends Handy{
    private String hersteller;
    public AndroidPhone(float preis,String hersteller){
        super(preis);
        this.hersteller = hersteller;
    }
}
