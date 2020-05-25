package model;

public final class RegisteredTruck extends Truck{

    public RegisteredTruck(String brand) {
        super(brand);
    }

    @Override
    public String toString() {
        return "registeredTruck " + brand +" with id : " + id;
    }

}
