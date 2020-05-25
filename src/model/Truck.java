package model;

public abstract class Truck extends Vehicle {
    public Truck(String brand) {
        super(brand);
    }
    @Override
    public String toString() {
        return "Truck " + brand +" with id : " + id;
    }

}
