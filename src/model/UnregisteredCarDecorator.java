package model;

public abstract class UnregisteredCarDecorator implements TollGatePayable {
    protected int extraFee;
    UnregisteredCar unregisteredCar;

    public UnregisteredCarDecorator(UnregisteredCar unregisteredCar) {
        this.unregisteredCar = unregisteredCar;
    }

    public abstract int getExtraFee();
}
