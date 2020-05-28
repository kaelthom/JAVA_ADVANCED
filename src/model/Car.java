package model;

public abstract class Car extends Vehicle implements ParkableCar {
    public Car(String brand, String plate) {
        super(brand, plate);
    }

}
