package model;

public class Application {

    public static final String TOTAL_COST_LABEL = " vehicles, unregistered total cost is ";
    public static final String PEUGEOT = "Peugeot";
    public static final String ASTRA = "Astra";

    public static void main(String[] args) {
        Parking<Vehicle> newParking = new Parking<>("JJP", "Jean Jaures Public");
        newParking.add(new RegisteredCar(PEUGEOT));
        newParking.add(new UnregisteredCar(ASTRA));
        newParking.add(new UnregisteredTruck("Renault"));
        newParking.add(new RegisteredTruck("Ford"));
        newParking.add(new UnregisteredTruck("Subaru"));
        System.out.println(newParking.getVehicles().size() + TOTAL_COST_LABEL + newParking.calculateTotalPrice());

        Parking<Car> newCarParking = new Parking<>("JJC", "Jean Jaures Car");
        newCarParking.add(new RegisteredCar(PEUGEOT));
        newCarParking.add(new UnregisteredCar("Astra"));
        System.out.println(newCarParking.getVehicles().size() + TOTAL_COST_LABEL + newCarParking.calculateTotalPrice());

        Parking<Truck> newTruckParking = new Parking<>("JJT", "Jean Jaures Truck");
        newTruckParking.add(new RegisteredTruck(PEUGEOT));
        newTruckParking.add(new UnregisteredTruck("Astra"));
        System.out.println(newTruckParking.getVehicles().size() + TOTAL_COST_LABEL + newTruckParking.calculateTotalPrice());

        System.out.println(newParking.getGates());
        System.out.println(newCarParking.getGates());
        System.out.println(newTruckParking.getGates());
    }
}
