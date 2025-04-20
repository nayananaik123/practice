package javainonevedio.datatypes;

public class Car {
    public String compony;
    String color;
    int year;
    String model;
    Double amount;
    public Car(String name,int yr,String model,Double amount,String color){
        this.amount=amount;
        this.color=color;
        this.model=model;
        this.compony=name;
        this.year=yr;

    }
    void show(){
        System.out.println("my car"+amount+"and colr"+color);
        System.out.println("\\n");


    }
}


