package model;

public class CacheApplication {
    public static void main(String[] args) {
        VehicleCache.loadCache();
        System.out.println("vehicle for plate 001 : " + VehicleCache.getVehicle("001"));
        System.out.println("vehicle for plate 002 : " + VehicleCache.getVehicle("002"));
    }
}
