package model;

public final class RegisteredTruck extends Truck {

    public RegisteredTruck(String brand, String plate) {
        super(brand, plate);
    }

    public static Vehicle createVehicle(String brand, String plate) {
        return new RegisteredTruck(brand, plate);
    }


}
