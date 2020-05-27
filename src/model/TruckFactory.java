package model;

public class TruckFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle createUnregisteredVehicle(String brand, String plate) {
        return new UnregisteredTruck(brand, plate);
    }

    @Override
    public Vehicle createRegisteredVehicle(String brand, String plate) {
        return new RegisteredTruck(brand, plate);
    }
}
