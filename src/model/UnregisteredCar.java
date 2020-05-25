package model;

public final class UnregisteredCar extends Car implements TollGatePayable{
    public UnregisteredCar(String brand) {
        super(brand);
    }

    @Override
    public String toString() {
        return "UnregisteredCar " + brand +" with id : " + id;
    }

    @Override
    public int payTollGate() {
        return 3;
    }
}
