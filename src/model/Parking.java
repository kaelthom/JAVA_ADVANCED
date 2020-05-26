package model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.IntStream;

public class Parking<T extends Vehicle> implements Comparable<Parking> {
    private final static int capacity = 15;
    private HashSet<T> vehicles;
    private HashSet<TollGate> tollGates;
    private String code;
    private String name;

    public Parking(String code, String name) {
        this.code = code;
        this.name = name;
        this.vehicles = new HashSet<>();
        this.tollGates = new HashSet<>();

        tollGates.add(new TollGate(Direction.IN, Orientation.NORTH));
        tollGates.add(new TollGate(Direction.OUT, Orientation.SOUTH));
    }

    public String getName() {
        return name;
    }

    public Set<T> getVehicles() {
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

    @Override
    public int compareTo(Parking o) {
        return Integer.compare(this.getVehicles().size(), o.getVehicles().size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parking)) return false;
        Parking<?> parking = (Parking<?>) o;
        return name.equals(parking.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Parking{" +
                "code='" + code + '\'' +
                '}';
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
        private String id;
        private boolean enable;
        private Direction direction;
        private Orientation orientation;
        private Parking parking;

        public TollGate(Direction direction, Orientation orientation) {
            this.enable = true;
            this.direction = direction;
            this.orientation = orientation;
            this.parking = Parking.this;
            this.id = this.parking.code + "#door-" + parking.tollGates.size();
        }

        @Override
        public String toString() {
            return this.id;
        }

    }
}
