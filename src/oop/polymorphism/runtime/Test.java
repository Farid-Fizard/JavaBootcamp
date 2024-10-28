package oop.polymorphism.runtime;

public class Test {
    public static void main (String[] args){
        Animal animal1= new Dog();
        Animal animal2= new Cat();
        animal1.eating();
        animal2.eating();

    }
}
