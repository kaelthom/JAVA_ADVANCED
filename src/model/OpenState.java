package model;

public class OpenState implements State {

    @Override
    public String getMessage(Parking parking) {
        return parking.toString() + "is open - " + (Parking.capacity - parking.getVehicles().size()) + " remaining places.";
    }
}
