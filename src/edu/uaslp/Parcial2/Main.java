package edu.uaslp.Parcial2;

public class Main {

    public static void main(String[] args) {
     Animal animal=new Animal();
     Bird bird=new Bird();
     Dog dog=new Dog();
     Duck duck=new Duck();


     duck.fly();

     dog.fur();

     animal.setColor("rojo");
     animal.setSize(25);
     animal.setNumpatas(4);
     animal.eat();

     bird.setColor("verde");
     bird.setSize(24);
     bird.setNumpatas(2);
     bird.eat();
     bird.walk();

     dog.setColor("amarillo");
     dog.setSize(10);
     dog.setNumpatas(4);
     dog.eat();
     dog.walk();
    }

}
