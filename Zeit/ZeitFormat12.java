package Zeit;

public class ZeitFormat12 extends Zeit {
    private int stunde12;
    private String zeitFormart;

    public ZeitFormat12() {
        if (this.getStunde() > 12) {
            this.stunde12 = this.getStunde() % 12;
            this.zeitFormart = "PM";
        } else {
            this.stunde12 = this.getStunde();
            this.zeitFormart = "AM";
        }
    }

    public void print() {
        System.out.printf("%s:%s %s", this.stunde12, this.getMinute(), this.zeitFormart);
    }
}
