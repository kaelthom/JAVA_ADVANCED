package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Parking<T extends Vehicle> {
    private final int capacity = 15;
    private List<T> vehicles;
    private List<TollGate> tollGates;
    private String code;
    private String name;

    public Parking(String code, String name) {
        this.code = code;
        this.name = name;
        this.vehicles = new ArrayList<>();
        this.tollGates = new ArrayList<>();

        tollGates.add(new TollGate(Direction.IN, Orientation.NORTH));
        tollGates.add(new TollGate(Direction.OUT, Orientation.SOUTH));
    }

    public List<T> getVehicles() {
        return vehicles;
    }

    public String getGates() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" gates:\n");
        for (TollGate tollGate : tollGates) {
            sb.append("--Gate: ").append(tollGate.toString()).append("\n");
        }
        return sb.toString();
    }

    public void add(T vehicle) {
        this.vehicles.add(vehicle);
    }

    public int calculateTotalPrice() {
        return vehicles.stream()
                .filter(vehicle -> vehicle instanceof TollGatePayable)
                .flatMapToInt(vehicle -> IntStream.of(((TollGatePayable) vehicle).payTollGate()))
                .sum();
    }

    public enum Direction {
        IN,
        OUT,
        INOUT
    }

    public enum Orientation {
        NORTH,
        SOUTH,
        WEST,
        EAST
    }

    public class TollGate {
        private int id;
        private boolean enable;
        private Direction direction;
        private Orientation orientation;
        private Parking parking;

        public TollGate(Direction direction, Orientation orientation) {
            this.enable = true;
            this.direction = direction;
            this.orientation = orientation;
            this.parking = Parking.this;
            this.id = this.parking.tollGates.size();
        }

        @Override
        public String toString() {
            return this.parking.code + "#door-" + id;
        }

    }
}
