package model;

public abstract class Vehicle {
    private static int count = 0;
    public final int id;
    public String brand;
    private static final int gaz = 100;

    @Override
    public String toString() {
        return "Vehicle " + brand +" with id : " + id;
    }

    public Vehicle(String brand) {
        this.id = count;
        this.brand = brand;
        System.out.println(this);
        count++;

    }

    public static int getCount() {
        return count;
    }
}
