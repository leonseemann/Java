package Polymorphismus4;

public class Fox extends Animal{
    public Fox(String name){
        this.name = name;
    }
    public void hunt(){
        System.out.printf("%s is hunting%n", this.name);
    }
}
