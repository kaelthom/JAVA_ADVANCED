package model;

public class Application {
    public static void main(String[] args) {
        Parking newParking = new Parking("A3", "Standard");
        newParking.add(new RegisteredCar("Peugeot"));
        newParking.add(new UnregisteredCar("Astra"));
        newParking.add(new UnregisteredTruck("Renault"));
        newParking.add(new RegisteredTruck("Ford"));
        newParking.add(new UnregisteredTruck("Subaru"));
        System.out.println(newParking.getVehicles().size() + " vehicles, unregistered total cost is " + newParking.calculateTotalPrice());

        Parking<Car> newCarParking = new Parking<>("A3", "Only Cars");
        newCarParking.add(new RegisteredCar("Peugeot"));
        newCarParking.add(new UnregisteredCar("Astra"));
        System.out.println(newCarParking.getVehicles().size() + " vehicles, unregistered total cost is " + newCarParking.calculateTotalPrice());
    }
}
