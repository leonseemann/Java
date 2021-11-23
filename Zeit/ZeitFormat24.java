package Zeit;

public class ZeitFormat24 extends Zeit{

    public void print(){
        System.out.printf("%s:%s", this.getStunde(), this.getMinute());
    }
}
