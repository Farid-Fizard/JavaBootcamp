package design_pattern.creational.factory;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("I am driving a car");
    }
}
