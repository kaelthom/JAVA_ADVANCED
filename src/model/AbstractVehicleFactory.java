package model;

public abstract class AbstractVehicleFactory {
    public static AbstractVehicleFactory getVehicleFactory(AbstractVehicleType abstractVehicleType) {
        switch (abstractVehicleType) {
            case CAR:
                return new CarFactory();
            case TRUCK:
                return new TruckFactory();
        }
        return null;
    }

    public abstract Vehicle createUnregisteredVehicle(String brand, String plate);

    public abstract Vehicle createRegisteredVehicle(String brand, String plate);

    public enum AbstractVehicleType {
        CAR,
        TRUCK
    }

}
