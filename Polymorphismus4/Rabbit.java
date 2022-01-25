package Polymorphismus4;

public class Rabbit extends Animal{
    public Rabbit(String name){
        this.name = name;
    }
    public void flee(){
        System.out.printf("%s is fleeing%n", this.name);
    }
}
