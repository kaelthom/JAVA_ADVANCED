package model;

public abstract class Vehicle {
    private static int count = 0;
    public final int id;
    public String brand;
    private static final int gaz = 100;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }

    public Vehicle(String brand) {
        this.id = count;
        this.brand = brand;
        System.out.println("Car " + brand +" with id : " + count);
        count++;

    }
}
