package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Parking {
    private String code;
    private String name;
    List<Vehicle> vehicles;

    public Parking(String code, String name) {
        this.code = code;
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void add(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public int calculateTotalPrice() {
        return vehicles.stream()
                .filter(vehicle -> vehicle instanceof TollGatePayable)
                .flatMapToInt(vehicle -> IntStream.of(((TollGatePayable) vehicle).payTollGate()))
                .sum();
    }
}
