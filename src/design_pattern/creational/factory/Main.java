package design_pattern.creational.factory;

public class Main {
    public static void main(String[] args){
        VehicleFactory factory= new VehicleFactory();
        Vehicle car= factory.createVehicle("Car");
        car.drive();
        Vehicle motorcycle= factory.createVehicle("Motorcycle");
        motorcycle.drive();
        Vehicle bicycle= factory.createVehicle("Bicycle");
        bicycle.drive();
        Vehicle bus= factory.createVehicle("Bus");
        bus.drive();
    }
}
