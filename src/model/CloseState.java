package model;

public class CloseState implements State {

    @Override
    public String getMessage(Parking parking) {
        return parking.toString() + "is closed.";
    }
}
