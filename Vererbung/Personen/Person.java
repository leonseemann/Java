package Vererbung.Personen;

public class Person {
    private String name, vorname;

 	public Person(){
        this("Seeman");
    }

    public Person(String n){
        this(n, "Leon");
    }

    public Person(String n, String v){
        this.name = n;
        this.vorname = v;
    }
    
    public String getName() {
 		return name;
 	}

 	public void setName(String name) {
 		this.name = name;
 	}

 	public String getVorname() {
 		return vorname;
 	}

 	public void setVorname(String vorname) {
 		this.vorname = vorname;
 	}

    public void print(){
        System.out.printf("Vorname: %s%nNachname: %s", vorname, name);
    }
}
