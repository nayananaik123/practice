package javainonevedio.datatypes;

class Pen{
    String color;
    protected String type;//example: ball point or gel point
    public void write(){
        System.out.println("writing something");
        this.type="gel";
    }
}
public class oops {
    public static void main(String[] args){
        Pen pen1=new Pen();//object cretaion
        pen1.color="blue";   //dot is used to  aceess the property of class
        pen1.type="gel";

    }
}
