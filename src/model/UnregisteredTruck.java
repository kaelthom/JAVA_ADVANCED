package model;

public final class UnregisteredTruck extends Truck implements TollGatePayable {

    public UnregisteredTruck(String brand) {
        super(brand);
    }

    @Override
    public int payTollGate() {
        return 5;
    }
}
