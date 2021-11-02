package Vererbung.Personen;

public class Schueler extends Person{
    private String klasse;
    public Schueler() {
    	this("Seemann", "Leon", "ITAM1");
    }
    
    public Schueler(String name, String vorname, String k){
    	super(name, vorname);
    	klasse = k; 
    }

    public void print(){
        System.out.printf("Vorname: %s%nNachname: %s%nIch bin Schueler und gehe in die Klasse %s", super.getVorname(), super.getName(), klasse);
    }
}
