package model;

public final class UnregisteredTruck extends Truck implements TollGatePayable {

    public UnregisteredTruck(String brand) {
        super(brand);
    }

    @Override
    public String toString() {
        return "UnregisteredTruck " + brand +" with id : " + id;
    }

    @Override
    public int payTollGate() {
        return 5;
    }
}
