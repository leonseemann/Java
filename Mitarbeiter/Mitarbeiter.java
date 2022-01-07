package Mitarbeiter;

public abstract class Mitarbeiter {
    private String name;
    private int persnr;

    Mitarbeiter(String name, int persnr){
        this.name = name;
        this.persnr = persnr;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPersnr(int persnr) {
        this.persnr = persnr;
    }

    public int getPersnr() {
        return persnr;
    }

    public void ausgabeDaten(){
        System.out.printf("Name: %s%nPersonalnummer: %s%n", name, persnr);
    }

    public abstract double monatsBrutto();
}
