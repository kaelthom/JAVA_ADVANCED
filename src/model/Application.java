package model;

import java.util.*;

public class Application {

    private static final String TOTAL_COST_LABEL = " vehicles, unregistered total cost is ";
    private static final String PEUGEOT = "Peugeot";
    private static final String ASTRA = "Astra";

    public static void main(String[] args) {
        Parking<Vehicle> newParking = new Parking<>("JJP", "Jean Jaures Public");
        newParking.add(new RegisteredCar(PEUGEOT, "AAA"));
        newParking.add(new UnregisteredCar(ASTRA, "BBB"));
        newParking.add(new UnregisteredTruck("Renault", "CCC"));
        newParking.add(new RegisteredTruck("Ford", "DDD"));
        newParking.add(new UnregisteredTruck("Subaru", "FFF"));
        System.out.println(newParking.getVehicles().size() + TOTAL_COST_LABEL + newParking.calculateTotalPrice());

        Parking<Car> newCarParking = new Parking<>("JJC", "Jean Jaures Car");
        newCarParking.add(new RegisteredCar(PEUGEOT, "HHH"));
        newCarParking.add(new UnregisteredCar(ASTRA, "GGG"));
        newCarParking.add(new UnregisteredCar(ASTRA, "PPP"));
        System.out.println(newCarParking.getVehicles().size() + TOTAL_COST_LABEL + newCarParking.calculateTotalPrice());

        Parking<Truck> newTruckParking = new Parking<>("JJT", "Jean Jaures Truck");
        newTruckParking.add(new UnregisteredTruck(PEUGEOT, "HHH"));
        newTruckParking.add(new UnregisteredTruck(PEUGEOT, "UUU"));
        System.out.println(newTruckParking.getVehicles().size() + TOTAL_COST_LABEL + newTruckParking.calculateTotalPrice());

        System.out.println(newParking.getGates());
        System.out.println(newCarParking.getGates());
        System.out.println(newTruckParking.getGates());

        List<Parking<? extends Vehicle>> parkings = Arrays.asList(newParking, newCarParking, newTruckParking);
        System.out.println("Default order");
        for (Parking<? extends Vehicle> parking : parkings) {
            System.out.println(parking.getName());
        }
        System.out.println("Sorting using Collections.sort()");
        List<Parking<? extends Vehicle>> sortedByDefaultParkings = new ArrayList<>(parkings);
        Collections.sort(sortedByDefaultParkings);
        for (Parking<? extends Vehicle> parking : sortedByDefaultParkings) {
            System.out.println(parking.getName() + " - " + parking.getVehicles().size());
        }
        System.out.println("Sorting using Comparator");
        List<Parking<? extends Vehicle>> sortedByTotalPrice = new ArrayList<>(parkings);
        sortedByTotalPrice.sort(Comparator.comparingInt(Parking::calculateTotalPrice));
        for (Parking<? extends Vehicle> parking : sortedByTotalPrice) {
            System.out.println(parking.getName() + " - " + parking.calculateTotalPrice());
        }

        newParking.add(new RegisteredCar(PEUGEOT, "ONE_MORE_THAN_CAPACITY"));
        Vehicle exitVehicle = newParking.getVehicles().stream().findAny().orElse(null);
        newParking.exit(exitVehicle);
        exitVehicle = newParking.getVehicles().stream().findAny().orElse(null);
        newParking.exit(exitVehicle);
        exitVehicle = newParking.getVehicles().stream().findAny().orElse(null);
        newParking.exit(exitVehicle);
        exitVehicle = newParking.getVehicles().stream().findAny().orElse(null);
        newParking.exit(exitVehicle);
        exitVehicle = newParking.getVehicles().stream().findAny().orElse(null);
        newParking.exit(exitVehicle);
        exitVehicle = newParking.getVehicles().stream().findAny().orElse(null);
        newParking.exit(exitVehicle);
        exitVehicle = newParking.getVehicles().stream().findAny().orElse(null);
        newParking.exit(exitVehicle);


        newParking.add(new RegisteredCar(PEUGEOT, "ANOTHER_CAR"));
    }
}
