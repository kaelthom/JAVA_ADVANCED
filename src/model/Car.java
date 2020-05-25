package model;

public abstract class Car extends Vehicle{
    public Car(String brand) {
        super(brand);
    }
    @Override
    public String toString() {
        return "Car " + brand +" with id : " + id;
    }

}
