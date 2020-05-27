package model;

public class CacheApplication {
    public static void main(String[] args) {
        VehicleCache.loadCache();
        System.out.println("vehicle for plate 001 : " + VehicleCache.getVehicle("001") + " - same instances as database? " + (VehicleCache.getVehicle("001") == VehicleCache.databaseVehicles.get(0)));
        System.out.println("vehicle for plate 002 : " + VehicleCache.getVehicle("002") + " - same instances as database? " + (VehicleCache.getVehicle("002") == VehicleCache.databaseVehicles.get(1)));
    }
}
