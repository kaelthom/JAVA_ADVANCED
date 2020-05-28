package model;

public final class RegisteredCar extends Car {
    public RegisteredCar(String brand, String plate) {
        super(brand, plate);
    }

    public static Vehicle createVehicle(String brand, String plate) {
        return new RegisteredCar(brand, plate);
    }

    @Override
    public void park() {
        System.out.println("Registered Car parked");
    }
}
