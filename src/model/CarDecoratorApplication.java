package model;

public class CarDecoratorApplication {
    public static void main(String[] args) {
        UnregisteredCarDecorator newTrailedBigCar = new UnregisteredTrailedCar(new UnregisteredCar("VIP car", "0002"), UnregisteredTrailedCar.TrailSize.BIG);
        System.out.println("total cost for this is : " + newTrailedBigCar.payTollGate() + " with " + newTrailedBigCar.getExtraFee() + " extra");
        UnregisteredCarDecorator newTrailedMediumCar = new UnregisteredTrailedCar(new UnregisteredCar("VIP car", "0002"), UnregisteredTrailedCar.TrailSize.MEDIUM);
        System.out.println("total cost for this is : " + newTrailedMediumCar.payTollGate() + " with " + newTrailedMediumCar.getExtraFee() + " extra");
        UnregisteredCarDecorator newTrailedSmallCar = new UnregisteredTrailedCar(new UnregisteredCar("VIP car", "0002"), UnregisteredTrailedCar.TrailSize.SMALL);
        System.out.println("total cost for this is : " + newTrailedSmallCar.payTollGate() + " with " + newTrailedSmallCar.getExtraFee() + " extra");
        UnregisteredCarDecorator newCustomCar = new UnregisteredCustomCar(new UnregisteredCar("VIP car", "0002"), 10, "VIP");
        System.out.println("total cost for this is : " + newCustomCar.payTollGate() + " with " + newCustomCar.getExtraFee() + " extra");
    }
}
