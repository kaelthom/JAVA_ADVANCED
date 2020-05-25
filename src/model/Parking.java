package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Parking<T extends Vehicle> {
    private final int capacity = 15;
    List<T> vehicles;
    private String code;
    private String name;

    public Parking(String code, String name) {
        this.code = code;
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public List<T> getVehicles() {
        return vehicles;
    }

    public void add(T vehicle) {
        this.vehicles.add(vehicle);
    }

    public int calculateTotalPrice() {
        return vehicles.stream()
                .filter(vehicle -> vehicle instanceof TollGatePayable)
                .flatMapToInt(vehicle -> IntStream.of(((TollGatePayable) vehicle).payTollGate()))
                .sum();
    }
}
