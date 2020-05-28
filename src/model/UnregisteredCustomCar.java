package model;

public class UnregisteredCustomCar extends UnregisteredCarDecorator {

    private String comment;

    public UnregisteredCustomCar(UnregisteredCar unregisteredCar, int extraFee, String comment) {
        super(unregisteredCar);
        this.extraFee = extraFee;
        this.comment = comment;
    }

    @Override
    public int getExtraFee() {
        return extraFee;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public int payTollGate() {
        return unregisteredCar.payTollGate() + extraFee;
    }


}
