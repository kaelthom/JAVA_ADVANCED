package model;

public class TruckFactory extends AbstractVehicleFactory {
    public Vehicle createUnregisteredVehicle(String brand, String plate) {
        return new UnregisteredTruck(brand, plate);
    }

    public Vehicle createRegisteredVehicle(String brand, String plate) {
        return new RegisteredTruck(brand, plate);
    }
}
