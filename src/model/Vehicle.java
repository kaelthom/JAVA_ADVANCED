package model;

import java.util.Objects;

public abstract class Vehicle implements Cloneable {
    private static final int gaz = 100;
    private static int count = 0;
    private final int id;
    private String brand;
    private String plate;

    public Vehicle(String brand, String plate) {
        this.id = count;
        this.brand = brand;
        this.plate = plate;
        System.out.println(this);
        count++;

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + brand + " with id : " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return plate.equals(vehicle.plate);
    }

    public String getPlate() {
        return plate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(plate);
    }

    @Override
    public Vehicle clone() {
        try {
            return (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
