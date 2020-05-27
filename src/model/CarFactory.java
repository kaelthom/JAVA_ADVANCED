package model;

public class CarFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle createUnregisteredVehicle(String brand, String plate) {
        return new UnregisteredCar(brand, plate);
    }

    @Override
    public Vehicle createRegisteredVehicle(String brand, String plate) {
        return new RegisteredCar(brand, plate);
    }
}
