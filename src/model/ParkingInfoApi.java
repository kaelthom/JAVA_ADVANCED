package model;

public class ParkingInfoApi extends AbstractObserver {
    private String url;

    public ParkingInfoApi(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ParkingInfoApi{" +
                "url='" + url + '\'' +
                '}';
    }

    @Override
    void update(String message) {
        System.out.println(this + "has been notified of " + message);
    }
}
