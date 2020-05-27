package model;

public class VehicleFactory {
    public Vehicle createVehicle(VehicleType vehicleType, String brand, String plate) {
        switch (vehicleType) {
            case UNREGISTERED_CAR:
                return UnregisteredCar.createVehicle(brand, plate);
            case REGISTERED_CAR:
                return RegisteredCar.createVehicle(brand, plate);
            case UNREGISTERED_TRUCK:
                return UnregisteredTruck.createVehicle(brand, plate);
            case REGISTERED_TRUCK:
                return RegisteredTruck.createVehicle(brand, plate);
        }
        return null;
    }

    public enum VehicleType {
        UNREGISTERED_CAR,
        REGISTERED_CAR,
        UNREGISTERED_TRUCK,
        REGISTERED_TRUCK
    }

}
