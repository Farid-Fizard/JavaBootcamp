package design_pattern.creational.factory;

public class VehicleFactory {
    public Vehicle createVehicle(String type){
        Vehicle vehicleType = null;
        if (type.equalsIgnoreCase("Car")){
            return new Car();
        }
        else if (type.equalsIgnoreCase("Motorcycle")){
            return new Motorcycle();
        }
        else if (type.equalsIgnoreCase("Bicycle")){
            return new Bicycle();
        }
        else if (type.equalsIgnoreCase("Bus")){
            return new Bus();
        }

        return vehicleType;
    }
}
