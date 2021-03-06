package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VehicleCache {
    private static AbstractVehicleFactory carFactory = AbstractVehicleFactory.getVehicleFactory(AbstractVehicleFactory.AbstractVehicleType.CAR);
    private static AbstractVehicleFactory truckFactory = AbstractVehicleFactory.getVehicleFactory(AbstractVehicleFactory.AbstractVehicleType.TRUCK);
    public static List<Vehicle> databaseVehicles = new ArrayList<>(
            Arrays.asList(
                    carFactory.createRegisteredVehicle("Car", "001"),
                    truckFactory.createRegisteredVehicle("Truck", "002")));
    private static List<Vehicle> vehicles = new ArrayList<>();

    public static void loadCache() {
        System.out.println("Loading data from DB..");
        for (Vehicle vehicle : databaseVehicles) {
            vehicles.add(vehicle.clone());
        }
        System.out.println(vehicles);
    }

    public static Vehicle getVehicle(String plate) {
        return vehicles.stream().filter(vehicle -> vehicle.getPlate().equals(plate)).findFirst().orElse(null);
    }

    public static void clearCache() {
        vehicles.clear();
    }
}
