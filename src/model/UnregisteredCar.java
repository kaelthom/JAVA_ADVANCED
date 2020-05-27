package model;

public final class UnregisteredCar extends Car implements TollGatePayable {
    public UnregisteredCar(String brand, String plate) {
        super(brand, plate);
    }

    public static Vehicle createVehicle(String brand, String plate) {
        return new UnregisteredCar(brand, plate);
    }

    @Override
    public int payTollGate() {
        return 3;
    }

}
