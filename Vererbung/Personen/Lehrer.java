package Vererbung.Personen;

public class Lehrer	extends Person {
    private String fach1, fach2;
    
    public Lehrer() {
    	this("Seemann", "Leon", "Deutsch", "Mathe"); 
    }
    
    public Lehrer(String name, String vorname, String f1, String f2){
    	super(name, vorname);
        fach1 = f1;
        fach2 = f2;
    }
    
    public void print() {
    	System.out.printf("Vorname: %s%nNachname: %s%nIch bin Lehrer und unterrichte die Faecher %s und %s", super.getVorname(), super.getName(), fach1, fach2);
    }
}
