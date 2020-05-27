package model;

public final class UnregisteredTruck extends Truck implements TollGatePayable {

    public UnregisteredTruck(String brand, String plate) {
        super(brand, plate);
    }

    public static Vehicle createVehicle(String brand, String plate) {
        return new UnregisteredTruck(brand, plate);
    }

    @Override
    public int payTollGate() {
        return 5;
    }

}
