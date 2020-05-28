package model;

public class UnregisteredTrailedCar extends UnregisteredCarDecorator {

    private TrailSize trailSize;

    public UnregisteredTrailedCar(UnregisteredCar unregisteredCar, TrailSize trailSize) {
        super(unregisteredCar);
        this.trailSize = trailSize;
    }

    public TrailSize getTrailSize() {
        return trailSize;
    }

    @Override
    public int payTollGate() {
        return trailSize.getExtraFee() + unregisteredCar.payTollGate();
    }

    @Override
    public int getExtraFee() {
        return trailSize.getExtraFee();
    }

    enum TrailSize {
        SMALL("SMALL", 1),
        MEDIUM("MEDIUM", 3),
        BIG("BIG", 5);

        String size;
        int extraFee;

        TrailSize(String size, int extraFee) {
            this.size = size;
            this.extraFee = extraFee;
        }

        String getSize() {
            return this.size;
        }

        int getExtraFee() {
            return this.extraFee;
        }
    }
}
