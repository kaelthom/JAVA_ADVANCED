package model;

public abstract class Truck extends Vehicle implements ParkableTruck {
    public Truck(String brand, String plate) {
        super(brand, plate);
    }

}
