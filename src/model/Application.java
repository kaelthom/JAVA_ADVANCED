package model;

import java.util.*;

public class Application {

    private static final String TOTAL_COST_LABEL = " vehicles, unregistered total cost is ";
    private static final String PEUGEOT = "Peugeot";
    private static final String ASTRA = "Astra";

    public static void main(String[] args) {

        AbstractObserver citySign = new CitySign("Grenoble");
        AbstractObserver parkingInfoApi = new ParkingInfoApi("https://whichparking.com");
        Parking<Parkable> newParking = new Parking<>("JJP", "Jean Jaures Public");
        Parking<Car> newCarParking = new Parking<>("JJC", "Jean Jaures Car");
        Parking<Truck> newTruckParking = new Parking<>("JJT", "Jean Jaures Truck");
        newParking.attach(citySign);
        newParking.attach(parkingInfoApi);
        newCarParking.attach(citySign);
        newCarParking.attach(parkingInfoApi);
        newTruckParking.attach(citySign);
        newTruckParking.attach(parkingInfoApi);
        newParking.add(new RegisteredCar(PEUGEOT, "AAA"));
        newParking.add(new UnregisteredCar(ASTRA, "BBB"));
        newParking.add(new UnregisteredTruck("Renault", "CCC"));
        newParking.add(new RegisteredTruck("Ford", "DDD"));
        newParking.add(new UnregisteredTruck("Subaru", "FFF"));
        System.out.println(newParking.getVehicles().size() + TOTAL_COST_LABEL + newParking.calculateTotalPrice());


        newCarParking.add(new RegisteredCar(PEUGEOT, "HHH"));
        newCarParking.add(new UnregisteredCar(ASTRA, "GGG"));
        newCarParking.add(new UnregisteredCar(ASTRA, "PPP"));
        System.out.println(newCarParking.getVehicles().size() + TOTAL_COST_LABEL + newCarParking.calculateTotalPrice());

        newTruckParking.add(new UnregisteredTruck(PEUGEOT, "HHH"));
        newTruckParking.add(new UnregisteredTruck(PEUGEOT, "UUU"));
        System.out.println(newTruckParking.getVehicles().size() + TOTAL_COST_LABEL + newTruckParking.calculateTotalPrice());

        System.out.println(newParking.getGates());
        System.out.println(newCarParking.getGates());
        System.out.println(newTruckParking.getGates());

        List<Parking<? extends Parkable>> parkings = Arrays.asList(newParking, newCarParking, newTruckParking);
        System.out.println("Default order");
        for (Parking<? extends Parkable> parking : parkings) {
            System.out.println(parking.getName());
        }
        System.out.println("Sorting using Collections.sort()");
        List<Parking<? extends Parkable>> sortedByDefaultParkings = new ArrayList<>(parkings);
        Collections.sort(sortedByDefaultParkings);
        for (Parking<? extends Parkable> parking : sortedByDefaultParkings) {
            System.out.println(parking.getName() + " - " + parking.getVehicles().size());
        }
        System.out.println("Sorting using Comparator");
        List<Parking<? extends Parkable>> sortedByTotalPrice = new ArrayList<>(parkings);
        sortedByTotalPrice.sort(Comparator.comparingInt(Parking::calculateTotalPrice));
        for (Parking<? extends Parkable> parking : sortedByTotalPrice) {
            System.out.println(parking.getName() + " - " + parking.calculateTotalPrice());
        }

        newParking.add(new RegisteredCar(PEUGEOT, "ONE_MORE_THAN_CAPACITY"));
        Parkable exitVehicle = newParking.getVehicles().stream().findAny().orElse(null);
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

        Map<String, List<Parking<? extends Parkable>>> departments = new HashMap<>();
        departments.putIfAbsent("Gironde", parkings);
        departments.putIfAbsent("Loire", parkings);

        Iterator<String> departKeysIt = departments.keySet().iterator();
        departKeysIt.forEachRemaining(
                key -> System.out.println(key + " - " + parkings)
        );

        VehicleFactory vehicleFactory = new VehicleFactory();
        vehicleFactory.createVehicle(VehicleFactory.VehicleType.REGISTERED_CAR, "Tata", "F0001");
        vehicleFactory.createVehicle(VehicleFactory.VehicleType.UNREGISTERED_CAR, "Tata", "F0002");
        vehicleFactory.createVehicle(VehicleFactory.VehicleType.REGISTERED_TRUCK, "Tata", "F0003");
        vehicleFactory.createVehicle(VehicleFactory.VehicleType.UNREGISTERED_TRUCK, "Tata", "F0004");

        AbstractVehicleFactory avf1 = AbstractVehicleFactory.getVehicleFactory(AbstractVehicleFactory.AbstractVehicleType.CAR);
        if (avf1 != null) {
            avf1.createRegisteredVehicle("Titi", "RCAR");
            avf1.createUnregisteredVehicle("Titi", "UCAR");
        }
        AbstractVehicleFactory avf2 = AbstractVehicleFactory.getVehicleFactory(AbstractVehicleFactory.AbstractVehicleType.TRUCK);
        if (avf2 != null) {
            avf2.createRegisteredVehicle("Titi", "RTRUCK");
            avf2.createUnregisteredVehicle("Titi", "UTRUCK");
        }

        newCarParking.openParking();
        newCarParking.park(new RegisteredCar("Titi", "NEWCARREGISTERED"));
        newCarParking.closeParking();
        newCarParking.openParking();

    }
}
