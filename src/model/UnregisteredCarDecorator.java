package model;

public abstract class UnregisteredCarDecorator implements TollGatePayable {
    public int extraFee;
    UnregisteredCar unregisteredCar;

    public UnregisteredCarDecorator(UnregisteredCar unregisteredCar) {
        this.unregisteredCar = unregisteredCar;
    }

    public abstract int getExtraFee();
}
