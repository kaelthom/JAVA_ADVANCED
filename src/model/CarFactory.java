package model;

public class CarFactory extends AbstractVehicleFactory {
    public Vehicle createUnregisteredVehicle(String brand, String plate) {
        return new UnregisteredCar(brand, plate);
    }

    public Vehicle createRegisteredVehicle(String brand, String plate) {
        return new RegisteredCar(brand, plate);
    }
}
